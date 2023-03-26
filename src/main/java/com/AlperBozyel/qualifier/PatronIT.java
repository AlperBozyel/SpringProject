package com.AlperBozyel.qualifier;


import jakarta.enterprise.inject.Alternative;

@QualifierMultiple
public class PatronIT implements PatronInterface {
    @Override
    public String patch(String data) {
        return "Patch IT: " + data;
    }
}
