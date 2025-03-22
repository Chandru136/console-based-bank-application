package com.project.bank.service;

import com.project.bank.entity.User;

import com.project.bank.repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void printUsers() {
        userRepository.printUsers();
    }

    public User login(String userName, String password) {
        return userRepository.login(userName, password);
    }

}
