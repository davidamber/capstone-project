package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.Brew;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.BrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrewServiceImpl implements BrewService {

    @Autowired
    private BrewRepository brewRepository;

    @Override
    public void saveBrew(Brew brew) {

    }
}
