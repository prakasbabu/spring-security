package com.pk.config;

import com.pk.entity.CustomUser;
import com.pk.repo.CustomUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final CustomUserRepo customUserRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<CustomUser> userInfo = customUserRepo.findByName(username);
       return userInfo.map(CustomUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("Username not found "+ username));
    }



}
