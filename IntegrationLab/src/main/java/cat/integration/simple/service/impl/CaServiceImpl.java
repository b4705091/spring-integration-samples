/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.impl;

import cat.integration.simple.dto.CaDto;
import cat.integration.simple.service.CaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class CaServiceImpl implements CaService {

    @Override
    public List<CaDto> listActiveCa() {
        List<CaDto> dtoList = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            CaDto dto = new CaDto();
            dto.setId(i);
            dto.setFirstName("first" + i);
            dto.setLastName("last" + i);
            dto.setEmail("email" + i + "@mail.com");
            dtoList.add(dto);
        }
        return dtoList;
    }
    
}
