package com.spring.security.service;

import com.spring.security.entity.User;
import com.spring.security.exception.UserAlreadyExistException;
import com.spring.security.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepository.findByUsername(username);
        if(u.getId() != 0){
            throw new UserAlreadyExistException();
        }
        return null;
    }

    public void createUser(User user){
        User u = userRepository.findByUsername(user.getUsername());
        if(u.getId() != 0){
            throw new UserAlreadyExistException();
        }
        userRepository.save(user);

    }
}
