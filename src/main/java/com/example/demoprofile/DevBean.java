package com.example.demoprofile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod")
public class DevBean
{
    public DevBean()
    {
        System.out.println("-----DevBean.DevBean()");
    }

}