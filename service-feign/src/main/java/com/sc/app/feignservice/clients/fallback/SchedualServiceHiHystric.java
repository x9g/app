package com.sc.app.feignservice.clients.fallback;

import com.sc.app.feignservice.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
