package com.kuhn.kuhnsblog.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class AuthService  {


    public boolean canAccess(HttpServletRequest request , Authentication authentication) {

        System.out.println("AuthService.canAccess()");
        boolean b = false ;



        Object pricipal = authentication.getPrincipal();  //通过Authentication.getPrincipal()可以获取到代表当前用户的信息，这个对象通常是UserDetails的实例
        if(pricipal == null || "anonymousUser".equals(pricipal)) {
            return b;
        }

        /*
         * 3/ 通过的request对象url）获取到权限信息。
         */



        /*
         *  4/ 将获取到的权限信息和当前的登录账号的权限信息进行比对。
         */




        return b;

    }

}
