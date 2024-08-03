package com.mhrrmsmsk.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;
@Alternative
@Named(value = "patronImpl")
public class Patron2 implements PatronInterface{
    @Override
    public String surum(String data) {
        return "Patron 2 "+data;
    }
}
