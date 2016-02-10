/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.impl;

import cat.integration.simple.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class SmsServiceImpl implements SmsService {

    private static final Logger logger = LoggerFactory.getLogger(SmsServiceImpl.class);
    
    @Override
    public void sendMsg(String msisdn, String msg) {
        logger.info("Send msg msisdn: {}, msg: {}", msisdn, msg);
    }

}
