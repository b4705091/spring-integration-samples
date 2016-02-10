/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.dto;

import java.time.LocalDate;

/**
 *
 * @author anuchitr
 */
public class RtcServiceDto {
    private String msisdn;
    private LocalDate activeDate;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public LocalDate getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(LocalDate activeDate) {
        this.activeDate = activeDate;
    }

    @Override
    public String toString() {
        return "RtcServiceDto{" + "msisdn=" + msisdn + ", activeDate=" + activeDate + '}';
    }
    
}
