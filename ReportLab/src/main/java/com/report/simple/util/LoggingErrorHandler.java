/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.simple.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

/**
 *
 * @author anuchitr
 */
public class LoggingErrorHandler implements ErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(LoggingErrorHandler.class);
    @Override
    public void handleError(Throwable thrwbl) {
        logger.error("", thrwbl);
    }
    
}
