package com.mhrrmsmsk.aop.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InerceptorPreventRoad
public class InterceptorPreventRoadExactWork {
    @AroundInvoke
    public Object loglama(InvocationContext context) {
        System.out.println("İlk Hali " + context.getMethod().getName());
// Kullanıcı giriş yapmış mı
        boolean isLogin = true; // yol kesici olacak değişkenimiz

        // jdbc:session ?
        Object isContinue = null; // eğer yol kesilmezse devam edecek

        if (isLogin) {
            // önce sisteme giriş yapsın
            System.out.println("!!! önce sisteme giriş yapsın");
            return null;
        } else {
            try {
                isContinue = context.proceed(); // devam etmesini sağlar
                System.out.println("Sonraki hali " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
