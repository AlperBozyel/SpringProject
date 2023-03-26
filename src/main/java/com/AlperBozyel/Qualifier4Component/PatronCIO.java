package com.AlperBozyel.Qualifier4Component;

import jakarta.enterprise.inject.Default;

@Default
public class PatronCIO implements PatronInterface {

    public String patch(String data) { return "patch Bussines: " + data; }
}
