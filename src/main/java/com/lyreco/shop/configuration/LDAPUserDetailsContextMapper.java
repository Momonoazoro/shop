package com.lyreco.shop.configuration;

import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

import java.util.*;
import java.util.stream.Collectors;

public class LDAPUserDetailsContextMapper implements UserDetailsContextMapper {

    public static final String LDAP_ATTRIBUTE_JOB = "title";
    public static final String LDAP_ATTRIBUTE_COUNTRY = "c";
    public static final String LDAP_ATTRIBUTE_FIRSTNAME = "givenname";
    public static final String LDAP_ATTRIBUTE_LASTNAME = "sn";

    @Override
    public UserDetails mapUserFromContext(DirContextOperations ctx, String username, Collection<? extends GrantedAuthority> authorities) {

        return extractUserDataFromContextLDap(username, ctx);
    }

    @Override
    public void mapUserToContext(UserDetails user, DirContextAdapter ctx) {

    }

    /**
     * Extract data from DirContextOperations to set LyrecoUser
     *
     * @param userName
     * @param ctx
     * @return LyrecoUser
     */
    private LyrecoUser extractUserDataFromContextLDap(final String userName, final DirContextOperations ctx){

        List<GrantedAuthority> mappedAuthorities = new ArrayList<GrantedAuthority>();

        final List<String> jobs = Arrays.asList(ctx.getObjectAttributes(LDAP_ATTRIBUTE_JOB)).stream()
                .map(object -> Objects.toString(object, null))
                .map(job -> job.equals("IS292") ? "ADMIN" : job)
                .collect(Collectors.toList());

        for ( String job : jobs){
            mappedAuthorities.add( () -> { return job;});
        }

        String country =  (String) ctx.getObjectAttribute(LDAP_ATTRIBUTE_COUNTRY);

        String firstName = (String) ctx.getObjectAttribute(LDAP_ATTRIBUTE_FIRSTNAME);

        String lastName =(String) ctx.getObjectAttribute(LDAP_ATTRIBUTE_LASTNAME);

        return new LyrecoUser(userName,firstName,lastName,country,mappedAuthorities);

    }
}

