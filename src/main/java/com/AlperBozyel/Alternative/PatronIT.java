package com.AlperBozyel.Alternative;


import jakarta.enterprise.inject.Alternative;

@Alternative
public class PatronIT implements PatronInterface {
    @Override
    public String patch(String data) {
        return "Patch IT: " + data;
    }
}
