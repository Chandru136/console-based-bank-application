package com.project.bank.entity;

import java.util.Objects;

public class User {

    private String userName;
    private String password;
    private String contactNumber;
    private String role;
    private Double accountBalance;

    public User(String userName, String password, String contactNumber, String role, Double accountBalance) {
        this.userName = userName;
        this.password = password;
        this.contactNumber = contactNumber;
        this.role = role;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", role='" + role + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(contactNumber, user.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, contactNumber);
    }
}
