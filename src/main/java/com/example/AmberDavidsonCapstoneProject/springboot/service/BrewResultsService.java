package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import java.util.List;

public interface BrewResultsService {
    List< BrewResults > getAllBrewResults();
    void saveBrewResults(BrewResults brewResults);
    BrewResults getBrewResultsById(long id);
    void deleteBrewResultsById(long id);
}
