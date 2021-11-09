package com.boockstore.shopping.service;


import com.boockstore.shopping.entities.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> retrieveAllUsers();

    User addUser(User user);

    void deleteUser(int id);

    User updateUser(User user);

    User retrieveUserbyID(int id);


}
