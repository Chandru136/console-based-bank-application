package com.project.bank.main;

import com.project.bank.entity.User;

import com.project.bank.service.UserService;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        UserService userService = new UserService();

        System.out.println("Enter User Name ");
        String userName = scanner.next();

        System.out.println("Enter your Password ");
        String password = scanner.next();

        User user = userService.login(userName, password);

        if (user != null) {
            System.out.println("You have Logged in Successfully!");
        } else {
            System.out.println("Login failed");
        }

    }
}
