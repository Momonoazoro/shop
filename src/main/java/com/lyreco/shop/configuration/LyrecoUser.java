package com.lyreco.shop.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
public class LyrecoUser extends User {

    private String firstName;
    private String lastName;
    private String country;

    public LyrecoUser(String username,String firstName, String lastName, String country, Collection<? extends GrantedAuthority> authorities) {
        super(username, "", true, true, true, true, authorities);
        setCountry(country);
        setFirstName(firstName);
        setLastName(lastName);
    }


}
