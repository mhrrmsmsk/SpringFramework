package com.mhrrmsmsk.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {
@Inject
List<String> consume;

    public List<String> getConsume() {
        return consume;
    }
}
