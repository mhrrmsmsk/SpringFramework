package com.mhrrmsmsk.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

// kapsam
// yaşam süresi
// performansı etkiler - +
@Named
//@ApplicationScoped // Bütün uygylama boyunca çalışır
//@RequestScoped // Bir istek boyunca çalışır
//@SessionScoped // Bir kullanıcı için yaşar ancak logout
//@Dependent // bukalemon
//@ConversationScoped // belli yapılarda belli istekler boyunca yaşar
@SessionScoped // Bean 1 instance olmasını sağlamak için
public class _00_Scoped {

}
