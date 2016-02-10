/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service;

import cat.integration.simple.dto.CaDto;
import java.util.List;

/**
 *
 * @author anuchitr
 */
public interface CaService {
    public List<CaDto> listActiveCa();
}
