package com.mhrrmsmsk.qualifier3;

import com.mhrrmsmsk.qualifier3.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@Default
@ApplicationScoped
public class Patron1 implements PatronInterface{
    @Override
    public String surum(String data) {
        return "Default "+data;
    }
}
