package com.AlperBozyel.aop.interceptor;


@Interceptorer
public class Login {

    public String isLoginMethod(String data){
        return "isLogin: "+data;
    }

}
