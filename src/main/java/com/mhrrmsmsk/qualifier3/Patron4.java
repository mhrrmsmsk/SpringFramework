package com.mhrrmsmsk.qualifier3;

import com.mhrrmsmsk.qualifier3.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

//@QualifierMultiple

@QualifierMultiple3(EMoreOptions.THIRD )
@ApplicationScoped
public class Patron4 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Data 3 "+data;
    }
}
