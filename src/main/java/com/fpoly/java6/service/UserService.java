package com.fpoly.java6.service;

import com.fpoly.java6.domain.Role;
import com.fpoly.java6.domain.User;

import java.util.List;

public interface UserService {
    User saveUseṛ(User user);
    Role saveRolẹ(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
