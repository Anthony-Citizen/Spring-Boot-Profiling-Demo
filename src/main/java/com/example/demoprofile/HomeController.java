package com.example.demoprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @Autowired
    ApplicationBean myAppBean;

    @GetMapping("/")
    public String welcome()
    {
        return myAppBean.getMessage()+
                ", user count is"+myAppBean.getUsercount()
                +", contact info:"+myAppBean.getContactinfo()
                +",Deployed in:"+myAppBean.getEnv()
                +","+myAppBean.getThankyoumessage();
    }

}