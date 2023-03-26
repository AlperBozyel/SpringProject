package com.AlperBozyel.Qualifier4Component;


@Qualifier4Multiple(EMultipleChoose.Second)
public class PatronIT implements PatronInterface {
    @Override
    public String patch(String data) {
        return "Patch IT: " + data;
    }
}
