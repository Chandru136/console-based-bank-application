package com.project.bank.main;

import com.project.bank.entity.User;

import com.project.bank.service.UserService;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    static Main main = new Main();

    public static void main(String[] args) {

        UserService userService = new UserService();

        while (true) {
            System.out.println("Enter User Name ");
            String userName = scanner.next();

            System.out.println("Enter your Password ");
            String password = scanner.next();

            User user = userService.login(userName, password);

            if (user != null && user.getRole().equals("admin")) {
                main.initAdmin();
            } else if (user != null && user.getRole().equals("user")) {
                main.initCustomer();
            } else {
                System.out.println("Login failed");
            }
        }
    }

    private void initAdmin() {
        boolean flag = true;

        while (flag) {
            System.out.println("1. Logout/ Exit");
            System.out.println("2. Create an Account for Customer");

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    flag = false;
                    System.out.println("You have Successfully logged out...");
                    break;
                case 2:
                    main.addNewCustomer();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("Enter Username");
        String username = scanner.next();

        System.out.println("Enter Password");
        String password = scanner.next();

        System.out.println("Enter Contact Number");
        String contact = scanner.next();
    }

    private void initCustomer() {
        System.out.println("You are a Customer");
    }
}
