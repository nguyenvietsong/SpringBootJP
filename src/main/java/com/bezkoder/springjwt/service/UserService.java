package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRollToUser(String username, ERole roleName);
    User getUser(String username);
    Role getRole(ERole role);
    List<User> getUsers();
}
