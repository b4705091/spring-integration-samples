/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.impl;

import cat.integration.simple.dto.InvoiceDto;
import cat.integration.simple.service.InvoiceService;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public List<InvoiceDto> listByCaId(Long id) {
        List<InvoiceDto> dtoList = new ArrayList<>();
        if (id %2 == 0) {
            return dtoList;
        }
        for (int i = 0; i < 5; i++) {
            InvoiceDto dto = new InvoiceDto();
            dto.setAmount(BigInteger.valueOf(i));
            dto.setCreatedDate(LocalDate.now());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
