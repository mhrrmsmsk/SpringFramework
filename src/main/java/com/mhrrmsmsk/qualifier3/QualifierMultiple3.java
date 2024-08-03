package com.mhrrmsmsk.qualifier3;

import jakarta.inject.Qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({FIELD, TYPE, METHOD})
@Retention(RUNTIME)
@Documented
public @interface QualifierMultiple3 {
    // enum yapısı
    EMoreOptions value();

}
