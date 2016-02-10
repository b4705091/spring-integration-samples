/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.integration;

import cat.integration.simple.dto.CaDto;
import cat.integration.simple.dto.InvoiceDto;
import cat.integration.simple.dto.RtcServiceDto;
import cat.integration.simple.service.CaService;
import cat.integration.simple.service.InvoiceService;
import cat.integration.simple.service.MailService;
import cat.integration.simple.service.RtcService;
import cat.integration.simple.service.SmsService;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class PromotionBroadcastService {

    private static final Logger logger = LoggerFactory.getLogger(PromotionBroadcastService.class);

    CaService caService;
    InvoiceService invoiceService;
    RtcService rtcService;

    MailService mailService;
    SmsService smsService;

    @Autowired
    public PromotionBroadcastService(CaService caService, InvoiceService invoiceService, RtcService rtcService, MailService mailService, SmsService smsService) {
        this.caService = caService;
        this.invoiceService = invoiceService;
        this.rtcService = rtcService;
        this.mailService = mailService;
        this.smsService = smsService;
    }

//    @PostConstruct
    public void broadcast() {
        List<CaDto> caList = listCa();
        caList.forEach(caDto -> {
            mailService.sendMsg(caDto.getEmail(), "Dear cust, we have new promo");

            caDto.getSvcList().forEach(rtcServiceDto -> {
                smsService.sendMsg(rtcServiceDto.getMsisdn(), "Dear cust, we have new promo");
            });
        });
    }

    public List<CaDto> listCa() {
        List<CaDto> caList = caService.listActiveCa();
        caList.forEach((CaDto caDto) -> {
            List<InvoiceDto> invoiceList = invoiceService.listByCaId(caDto.getId());

            List<InvoiceDto> pendingInvoiceList = invoiceList.stream()
                .filter(invoiceDto -> {
                    return invoiceDto.getAmount().compareTo(BigInteger.ZERO) > 0;
                }).collect(Collectors.toList());
            caDto.setPendingInvoiceList(pendingInvoiceList);

        });

        List<CaDto> goodCaList = caList.stream()
            .filter(caDto -> {
                return caDto.getPendingInvoiceList().isEmpty();
            }).collect(Collectors.toList());

        goodCaList.stream()
            .forEach((CaDto caDto) -> {
                List<RtcServiceDto> svcList = rtcService.listByCaId(caDto.getId());
                caDto.setSvcList(svcList);

                logger.info("{} has {} invoice, and {} svc", caDto, caDto.getPendingInvoiceList().size(), caDto.getSvcList().size());
            });
        return goodCaList;
    }

}
