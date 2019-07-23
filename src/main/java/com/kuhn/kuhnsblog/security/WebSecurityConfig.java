package com.kuhn.kuhnsblog.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/loginPage")
                .and()
                .authorizeRequests()
                .antMatchers("/loginPage").permitAll()
                .antMatchers("/home", "/").permitAll()
                .anyRequest().access("@authService.canAccess(request , authentication)")
                .and()
                .sessionManagement().maximumSessions(1)

        ;
    }


    @Bean //注入PsswordEncoder
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
