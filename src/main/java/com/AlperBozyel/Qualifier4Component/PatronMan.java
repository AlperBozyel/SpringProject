package com.AlperBozyel.Qualifier4Component;

@Qualifier4Multiple(EMultipleChoose.Third)
public class PatronMan implements PatronInterface {

    public String patch(String data) { return "patch Management: " + data; }
}
