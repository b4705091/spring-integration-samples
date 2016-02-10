/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.service;

/**
 *
 * @author anuchitr
 */
public interface SmsService {
    public void sendMsg(String msisdn, String msg);
}
