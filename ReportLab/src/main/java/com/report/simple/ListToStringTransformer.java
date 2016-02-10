/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report.simple;

import java.util.List;
import org.springframework.integration.annotation.Transformer;
import org.springframework.util.StringUtils;

/**
 *
 * @author anuchitr
 */
public class ListToStringTransformer {
    private String delim = "\n";

    public void setDelim(String delim) {
        this.delim = delim;
    }
    
    @Transformer
    public String transform(List<String> payload) {
        return StringUtils.collectionToDelimitedString(payload, delim);
    }
}
