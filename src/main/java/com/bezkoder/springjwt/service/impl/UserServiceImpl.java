package com.bezkoder.springjwt.service.impl;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import com.bezkoder.springjwt.service.UserService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("save user "+ user.getUsername());
        userRepository.save(user);
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        Role newrole=roleRepository.save(role);
        return newrole;
    }

    @Override
    public void addRollToUser(String username, ERole roleName) {
        log.info("user add role !");
        Set<Role> roles = new HashSet<>();
        User user=userRepository.findByUsername(username)
                .orElseThrow(()->new RuntimeException("User not found !"));
        Role role=roleRepository.findByName(roleName)
                .orElseThrow(()->new RuntimeException("role not found !"));
        roles.add(role);
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        User user=userRepository.findByUsername(username)
                .orElseThrow(()->new RuntimeException("User not found !"));
        return user;
    }

    @Override
    public Role getRole(ERole role) {
        Role r=roleRepository.findByName(role)
                .orElseThrow(()->new RuntimeException("role ko co"));
        return r;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
