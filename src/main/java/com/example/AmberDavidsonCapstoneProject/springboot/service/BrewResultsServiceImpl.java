package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.BrewResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrewResultsServiceImpl implements BrewResultsService {

    @Autowired
    private BrewResultsRepository brewResultsRepository;

    @Override
    public List<BrewResults> getAllBrewResults() {
        return brewResultsRepository.findAll();
    }

    @Override
    public void saveBrewResults(BrewResults brewResults) {
        brewResultsRepository.save(brewResults);
    }
    @Override
    public BrewResults getBrewResultsById(long id) {
        Optional<BrewResults> optional = brewResultsRepository.findById(id);
        BrewResults brewResults = null;
        if (optional.isPresent()) {
            brewResults = optional.get();
        } else {
            throw new RuntimeException(" Brew results not found for id :: " + id);
        }
        return brewResults;
    }

    @Override
    public void deleteBrewResultsById(long id) {
        BrewResults brewResults = getBrewResultsById(id);
        brewResultsRepository.delete(brewResults);
    }
}
