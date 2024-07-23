package com.mhrrmsmsk.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Log4j2

// cdi => bean
@Named(value = "namedtuto")
@ApplicationScoped

public class _01_Named {
    private Long namedID;
    private String namedData="Mehabalar Named Cdi Bean";


}
