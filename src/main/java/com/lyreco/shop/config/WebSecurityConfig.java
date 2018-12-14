package com.lyreco.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${ldap.search.base}")
    private String ldapSearchBase;


    @Value("${ldap.search.filter}")
    private String ldapSearchFilter;

    @Value("${ldap.context.source}")
    private String ldapContextSource;

    @Value("${ldap.enable}")
    private boolean ldapEnable;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        LDAPUserDetailsContextMapper contextMapper = new LDAPUserDetailsContextMapper();

        if (ldapEnable){
            auth.ldapAuthentication()
                    .userSearchBase(ldapSearchBase)
                    .userSearchFilter(ldapSearchFilter)
                    .contextSource()
                    .url(ldapContextSource)
                    .and()
                    .userDetailsContextMapper(contextMapper);
        }else{
            auth
                    .inMemoryAuthentication()
                    .withUser("user").password("{noop}password").roles("USER")
                    .and()
                    .withUser("admin").password("{noop}admin").roles("ADMIN");
        }


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin();
    }
}
