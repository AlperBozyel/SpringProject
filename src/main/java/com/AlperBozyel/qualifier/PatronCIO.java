package com.AlperBozyel.qualifier;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Default
public class PatronCIO implements PatronInterface {

    public String patch(String data) { return "patch CIO: " + data; }
}
