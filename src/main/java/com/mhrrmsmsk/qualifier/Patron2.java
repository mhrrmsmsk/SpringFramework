package com.mhrrmsmsk.qualifier;

import com.mhrrmsmsk.alternative.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

//@QualifierMultiple
@QualifierMultiple
@ApplicationScoped
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Patron 2 "+data;
    }
}
