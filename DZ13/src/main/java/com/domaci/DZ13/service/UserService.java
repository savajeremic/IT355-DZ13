/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domaci.DZ13.service;

import com.domaci.DZ13.model.User;

/**
 *
 * @author Jack
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
