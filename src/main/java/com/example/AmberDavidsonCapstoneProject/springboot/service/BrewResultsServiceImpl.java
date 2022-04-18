package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.BrewResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrewResultsServiceImpl implements BrewResultsService {

    @Autowired
    private BrewResultsRepository brewResultsRepository;

    @Override
    public List<BrewResults> getAllBrewResults() {
        return null;
    }

    @Override
    public void saveBrewResults(BrewResults brewResults) {

    }
    @Override
    public BrewResults getBrewResultsById(long id) {
        return null;
    }

    @Override
    public void deleteBrewResultsById(long id) {

    }
}
