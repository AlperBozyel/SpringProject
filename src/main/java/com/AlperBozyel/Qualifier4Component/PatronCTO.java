package com.AlperBozyel.Qualifier4Component;

@Qualifier4Multiple(EMultipleChoose.First)
public class PatronCTO implements PatronInterface {

    public String patch(String data) { return "patch Developement: " + data; }
}
