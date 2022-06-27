package org.dev.service;

import org.dev.entities.AppRole;
import org.dev.entities.AppUser;

public interface AccountService
{
    public AppUser saveUser(String username, String password, String confirmedPassword);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username, String roleName);
}
