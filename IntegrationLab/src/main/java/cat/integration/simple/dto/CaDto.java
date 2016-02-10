/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.dto;

import java.util.List;

/**
 *
 * @author anuchitr
 */
public class CaDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<InvoiceDto> pendingInvoiceList;
    private List<RtcServiceDto> svcList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<InvoiceDto> getPendingInvoiceList() {
        return pendingInvoiceList;
    }

    public void setPendingInvoiceList(List<InvoiceDto> pendingInvoiceList) {
        this.pendingInvoiceList = pendingInvoiceList;
    }

    public List<RtcServiceDto> getSvcList() {
        return svcList;
    }

    public void setSvcList(List<RtcServiceDto> svcList) {
        this.svcList = svcList;
    }

    @Override
    public String toString() {
        return "CaDto{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
}
