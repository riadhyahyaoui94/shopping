package com.boockstore.shopping.service;

import com.boockstore.shopping.entities.User;
import com.boockstore.shopping.repository.LivreRepo;
import com.boockstore.shopping.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserServiceInterface {
    @Autowired UserRepo user;


    @Override
    public List<User> retrieveAllUsers() {
        ArrayList<User> listuser= (ArrayList<User>) user.findAll();
                return listuser;
    }

    @Override
    public User addUser(User u) {
        user.save(u);
        return u;

    }

    @Override
    public void deleteUser(int id) {
    user.deleteById(id);
    }

    @Override
    public User updateUser(User u) {
        user.save(u);
        return null;
    }

    @Override
    public User retrieveUserbyID(int id) {
      User user1=user.findById(id).orElse(null);
        return user1;
    }
}
