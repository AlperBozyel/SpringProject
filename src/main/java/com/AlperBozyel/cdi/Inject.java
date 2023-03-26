package com.AlperBozyel.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injectTuto")
@ApplicationScoped
public class Inject {

    public List<String> getConsumer() {
        return consumer;
    }

    @jakarta.inject.Inject
    List<String> consumer;
}
