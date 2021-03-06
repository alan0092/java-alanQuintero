/*******************************************************
 * Copyright (C) 2016 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "Movie Picked".
 * 
 * "Movie Picked" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/
package com.alanquintero.mp.service;

import java.util.List;

import com.alanquintero.mp.entity.User;

/**
 * @class UserService.java
 * @purpose Interface of Service Layer for User Transactions.
 */
public interface UserService {

    /**
     * @return List_User
     */
    public List<User> getAllUsers();

    /**
     * @param String
     * @return User
     */
    public User searchUserById(String userCode);

    /**
     * @param String
     * @return User
     */
    public User searchUserWithReviewsById(String userCode);

    /**
     * @param User
     * @return boolean
     */
    public boolean saveUser(User user);

    /**
     * @param String
     * @return User
     */
    public User searchUserWithReviewsByName(String userName);

    /**
     * @param String
     * @return String
     */
    public String deleteUser(String userCode);

    /**
     * @param String
     * @return User
     */
    public User searchUserByName(String userName);

    /**
     * @param String
     * @return User
     */
    public User searchUserByEmail(String userEmail);

    /**
     * @param User
     * @param String
     * @return boolean
     */
    public boolean saveOrUpdateQuote(User user, String userName);

    /**
     * @param String
     * @param String
     * @return boolean
     */
    public boolean checkUserPassword(String userEmail, String userPassword);

    /**
     * @param String
     * @param String
     * @return boolean
     */
    public boolean updateUserPassword(String userName, String newPassword);

}
