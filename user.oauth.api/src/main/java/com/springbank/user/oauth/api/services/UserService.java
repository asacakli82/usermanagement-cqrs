package com.springbank.user.oauth.api.services;

import com.springbank.user.oauth.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value="userService")
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.findByUsername(username)
                .map(item -> User.withUsername(item.getAccount().getUsername())
                        .password(item.getAccount().getPassword())
                        .authorities(item.getAccount().getRoles())
                        .accountExpired(false).accountLocked(false)
                        .credentialsExpired(false).disabled(false)
                        .build())
                .orElseThrow(()->new UsernameNotFoundException("Invalid username or password!"));
    }

}
