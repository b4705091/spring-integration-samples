/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.impl;

import cat.integration.simple.dto.RtcServiceDto;
import cat.integration.simple.service.RtcService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class RtcServiceImpl implements RtcService {

    @Override
    public List<RtcServiceDto> listByCaId(Long id) {
        List<RtcServiceDto> dtoList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            RtcServiceDto dto = new RtcServiceDto();
            dto.setMsisdn("091234567" + i);
            dto.setActiveDate(LocalDate.now());
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
