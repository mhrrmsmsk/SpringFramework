package com.mhrrmsmsk.qualifier;

import com.mhrrmsmsk.alternative.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value="qualifierCdi")
@ApplicationScoped
public class Calisan {
@Inject
//@QualifierMultiple
    private PatronInterface patronInterface;
public String getData(String data){
    return patronInterface.surum(data);
}
}
