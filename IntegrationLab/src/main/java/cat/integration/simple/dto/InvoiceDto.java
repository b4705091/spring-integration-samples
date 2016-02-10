/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.integration.simple.dto;

import java.math.BigInteger;
import java.time.LocalDate;

/**
 *
 * @author anuchitr
 */
public class InvoiceDto {
    private BigInteger amount;
    private LocalDate createdDate;

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" + "amount=" + amount + ", createdDate=" + createdDate + '}';
    }
}
