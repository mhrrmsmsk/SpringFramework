package com.mhrrmsmsk.aop.decorator;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named("iEvImpl")
@ApplicationScoped
public class Bahce implements IEv{
    @Override
    public String boyama(String data) {
        return data;
    }
}
