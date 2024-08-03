package com.mhrrmsmsk.qualifier3;

import com.mhrrmsmsk.qualifier3.PatronInterface;
import com.mhrrmsmsk.qualifier3.QualifierMultiple3;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
    @Inject
    @Default
    private PatronInterface patronInterface;
    //@Inject
   // @QualifierMultiple3(EMoreOptions.SECOND)
    //private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
