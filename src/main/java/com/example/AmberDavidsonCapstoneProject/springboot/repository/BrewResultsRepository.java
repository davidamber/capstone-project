package com.example.AmberDavidsonCapstoneProject.springboot.repository;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrewResultsRepository extends JpaRepository<BrewResults, Long>{

}