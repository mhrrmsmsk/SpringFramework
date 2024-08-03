package com.mhrrmsmsk.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;
@InerceptorPreventRoad
@ApplicationScoped
public class Login {
    public String isLoginMethod(String data){
        return "isLogin: "+ data;
    }
}
