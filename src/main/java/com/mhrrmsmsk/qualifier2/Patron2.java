package com.mhrrmsmsk.qualifier2;

import com.mhrrmsmsk.alternative.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;

//@QualifierMultiple
@QualifierMultiple
@ApplicationScoped
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Patron 2 "+data;
    }
}
