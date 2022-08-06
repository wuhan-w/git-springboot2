package com.itheima.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class infoConfig implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("runTime",System.currentTimeMillis()).withDetail("company","传智教育");
        Map infoMap = new HashMap<>();
        infoMap.put("buildTime","2006");
        builder.withDetails(infoMap);
    }
}
