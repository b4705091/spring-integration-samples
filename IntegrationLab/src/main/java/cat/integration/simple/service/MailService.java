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
public interface MailService {
    public void sendMsg(String to, String msisdn);
    public void sendMsg(String from, String to, String subject, String body);
}
