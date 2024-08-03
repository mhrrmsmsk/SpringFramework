package com.mhrrmsmsk.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.extern.java.Log;

import java.io.Serial;
import java.io.Serializable;

@Named(value = "aopInterceptor")
@ApplicationScoped
public class AopBean implements Serializable {
    private static final long serialVersionUID=1L;
    @Inject
    private Login login;

    public String getAopBean(){
        return login.isLoginMethod("interceptor: prevent road");
    }


}
