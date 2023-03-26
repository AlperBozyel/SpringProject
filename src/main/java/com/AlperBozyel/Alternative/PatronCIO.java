package com.AlperBozyel.Alternative;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class PatronCIO implements PatronInterface {

    public String patch(String data) { return "patch CIO: " + data; }
}
