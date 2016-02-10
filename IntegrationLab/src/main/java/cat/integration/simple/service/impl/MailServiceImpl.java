/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service.impl;

import cat.integration.simple.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author anuchitr
 */
@Service
public class MailServiceImpl implements MailService {

    private static final Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);
    
    @Override
    public void sendMsg(String to, String msisdn) {
        logger.info("Send msg to: {}, msisdn: {}", to, msisdn);
    }

    @Override
    public void sendMsg(String from, String to, String subject, String body) {
        logger.info("Send msg from: {}, to: {}, subject: {}, body: {}", from, to, subject, body);
    }
    
}
