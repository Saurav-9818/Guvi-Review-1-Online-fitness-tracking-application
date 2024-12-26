package com.fitnessapp.model;

import java.math.BigDecimal;

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private BigDecimal height;
    private BigDecimal weight;

    // Constructor
    public User(int userId, String username, String password, String email, String firstName, String lastName, String gender, int age, BigDecimal height, BigDecimal weight) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters for all fields
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public BigDecimal getHeight() { return height; }
    public void setHeight(BigDecimal height) { this.height = height; }
    public BigDecimal getWeight() { return weight; }
    public void setWeight(BigDecimal weight) { this.weight = weight; }
}
