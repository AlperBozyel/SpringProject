package com.AlperBozyel.Alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativeDi")
@ApplicationScoped
public class Employer {

    @Inject
    private PatronInterface patronInterface;

    public String getData(String data) { return patronInterface.patch(data);}
}
