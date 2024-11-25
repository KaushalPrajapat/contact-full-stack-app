package com.contact.contact.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.contact.contact.models.User;
import com.contact.contact.repositories.UserRepo;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo UserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = UserRepo.findByEmail(username).get();
        System.out.println(user);
        if (user != null)
            return user;
        else
            throw new UsernameNotFoundException(username);

    }

}
