package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // Done : return apiService.getUsers function
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // Done : Call apiService.generateRandomUser function
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // Done : Call apiService.deleteUser(user) function
        apiService.deleteUser(user);
    }
}
