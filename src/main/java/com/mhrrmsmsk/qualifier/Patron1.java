package com.mhrrmsmsk.qualifier;

import com.mhrrmsmsk.alternative.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;

@Default
@ApplicationScoped
public class Patron1 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "Default "+data;
    }
}
