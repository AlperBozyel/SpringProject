package com.AlperBozyel.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@jakarta.inject.Named(value = "namedtuto")
@ApplicationScoped
public class Named {

    private Long nameId;
    private String namedData="Merhabalar Named CDI Bean";

}
