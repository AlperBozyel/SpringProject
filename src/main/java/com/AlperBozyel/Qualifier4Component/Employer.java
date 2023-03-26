package com.AlperBozyel.Qualifier4Component;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier4Cdi")
@ApplicationScoped
public class Employer {

    @Inject
    @Qualifier4Multiple(EMultipleChoose.Third)
    private PatronInterface patronInterface;

    public String getData(String data) { return patronInterface.patch(data);}
}
