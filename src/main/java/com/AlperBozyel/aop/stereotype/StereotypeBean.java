package com.AlperBozyel.aop.stereotype;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@MyStereotype
@Data @AllArgsConstructor @NoArgsConstructor
public class StereotypeBean {

    private Long id;
    private String name;
    private String trade;
}
