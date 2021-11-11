package com.boockstore.shopping.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetails {
    org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
