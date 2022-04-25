package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserPreference;
import java.util.List;

public interface UserPreferenceService {
    List<UserPreference> getAllUserPreferences();


    void saveUserPreference(UserPreference userPreference);
    UserPreference getUserPreferenceById(long id);
    void deleteUserPreferenceById(long id);
}
