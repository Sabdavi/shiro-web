package com.saeid.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.mgt.DefaultFilter;

public class ServiceGateway {
    static {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityUtils.setSecurityManager(factory.getInstance());

    }
    public static void handleRequest(){
        //DefaultFilter.anon.
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("root", "saeid");

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

    }
}
