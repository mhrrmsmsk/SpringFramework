package com.mhrrmsmsk.aop.stereotype;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@MyStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private long id;
    private String name = "Merhaba";
    private String trade;

}
