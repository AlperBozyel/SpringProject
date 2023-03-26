package com.AlperBozyel.qualifier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Employer {

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    public String getData(String data) { return patronInterface.patch(data);}
}
