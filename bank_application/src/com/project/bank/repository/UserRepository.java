package com.project.bank.repository;

import com.project.bank.entity.User;

import java.util.HashSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserRepository {

    private static Set<User> users = new HashSet<>();

    static {

        User user1 = new User("admin", "admin", "987456321", "admin", 0.0);
        User user2 = new User("user2", "user2", "789456321", "user", 1000.0);
        User user3 = new User("user3", "user3", "852147963", "user", 2000.0);
        User user4 = new User("user4", "user4", "687452139", "user", 3000.0);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

    }

    public void printUsers() {
        System.out.println(users);
    }

    public User login(String userName, String password) {
        List<User> finalList = users.stream()
                                .filter(user -> user.getUserName()
                                .equals(userName) && user.getPassword()
                                .equals(password))
                                .collect(Collectors.toList());

        if (!finalList.isEmpty()) {
            return finalList.get(0);
        } else {
            return null;
        }
    }

}
