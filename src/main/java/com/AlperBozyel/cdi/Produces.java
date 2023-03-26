package com.AlperBozyel.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class Produces {

    @jakarta.enterprise.inject.Produces
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("CSS3");
        list.add("JS");
        list.add("React");
        list.add("Angular");
        return list;
    }
}
