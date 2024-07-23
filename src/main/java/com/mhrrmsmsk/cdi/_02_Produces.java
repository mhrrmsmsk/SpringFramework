package com.mhrrmsmsk.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
@Named(value = "producetuto")
@ApplicationScoped

public class _02_Produces {
@Produces // üretiyor
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("HTML");
        liste.add("CSS");
        liste.add("React");
        liste.add("javascrpt");
        liste.add("angular");
        return liste;
    }
}
