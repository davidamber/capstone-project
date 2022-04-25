package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserPreference;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPreferenceServiceImpl implements UserPreferenceService {

    @Autowired
    private UserPreferenceRepository userPreferenceRepository;

    @Override
    public List<UserPreference> getAllUserPreferences() {
        return userPreferenceRepository.findAll();
    }

    @Override
    public void saveUserPreference(UserPreference userPreference) {

    }
    @Override
    public UserPreference getUserPreferenceById(long id) {

        return userPreferenceRepository.getByBrewMethodId(id);
    }

    @Override
    public void deleteUserPreferenceById(long id) {

    }
}
