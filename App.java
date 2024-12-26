package com.fitnessapp;

import com.fitnessapp.dao.UserDAO;
import com.fitnessapp.model.User;

public class App {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        
        // Add a new user
        User user = new User(0, "john_doe", "password123", "john@example.com", "John", "Doe", "Male", 25, new BigDecimal(5.9), new BigDecimal(70));
        boolean isUserAdded = userDAO.addUser(user);
        System.out.println("User added: " + isUserAdded);
        
        // Get a user by username
        User retrievedUser = userDAO.getUserByUsername("john_doe");
        if (retrievedUser != null) {
            System.out.println("User retrieved: " + retrievedUser.getUsername());
        } else {
            System.out.println("User not found.");
        }
    }
}
