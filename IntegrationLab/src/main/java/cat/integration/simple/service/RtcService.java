/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service;

import cat.integration.simple.dto.RtcServiceDto;
import java.util.List;

/**
 *
 * @author anuchitr
 */
public interface RtcService {
    public List<RtcServiceDto> listByCaId(Long id);
}
