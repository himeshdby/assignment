package com.singtel.assignment;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import java.util.Collection;

import static org.springframework.http.HttpMethod.*;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
public class ConfigSecurity extends WebSecurityConfigurerAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigSecurity.class);


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/api/**").permitAll()
                .antMatchers(PUT, "/api/update/animal").hasAnyAuthority("Admin")
                .antMatchers(POST, "/api/create/animal").hasAnyAuthority("Admin")
                .antMatchers(PUT, "/api/delete/animal").hasAnyAuthority("Admin")
                .antMatchers(PUT, "/api/get/animal").hasAnyAuthority("custom_scope")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();

    }



}