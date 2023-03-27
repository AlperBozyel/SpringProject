package com.AlperBozyel.aop.interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Interceptorer
public class InterceptorMain {

    @AroundInvoke public Object logging(InvocationContext context){
        System.out.println("First Version: "+context.getMethod().getName());

        //Is user login?
        boolean isLogin = false;  // Interceptor object
        Object isContinue = null;   // if interceptor false continue

        if (!(isLogin)){
            System.out.println("You must login the System first!");
            return null;
        }else {
            try {
                isContinue = context.proceed();  // provide to continue
                System.out.println("Last Status: "+isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
