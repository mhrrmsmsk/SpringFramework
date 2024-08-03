package com.mhrrmsmsk.qualifier3;

import com.mhrrmsmsk.qualifier3.PatronInterface;
import com.mhrrmsmsk.qualifier3.QualifierMultiple3;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Typed;

//@QualifierMultiple

@QualifierMultiple3(EMoreOptions.FIRST)
@ApplicationScoped
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Data 1 "+data;
    }
}
