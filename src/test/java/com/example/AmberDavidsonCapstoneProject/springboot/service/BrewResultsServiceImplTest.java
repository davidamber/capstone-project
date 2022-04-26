package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.BrewResultsRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BrewResultsServiceImplTest {

    @Autowired
    private BrewResultsServiceImpl brewResultsServiceImpl;

    @Test
    @Transactional
    void getAllBrewResults() {
        List<BrewResults> allBrewResults = brewResultsServiceImpl.getAllBrewResults();
        int beforeAddingMoreBrewResults = allBrewResults.size();

        BrewResults brew1 = new BrewResults();
        brew1.setMethodName("Coffee Machine");
        brew1.setCoffee(15.62);
        brew1.setWater(265.5);
        brewResultsServiceImpl.saveBrewResults(brew1);
        int afterAddingMoreBrewResults = brewResultsServiceImpl.getAllBrewResults().size();

        Assertions.assertThat(afterAddingMoreBrewResults).isEqualTo(beforeAddingMoreBrewResults + 1);
        Assertions.assertThat(allBrewResults.contains(brew1)).isTrue();
    }

    @Test
    @Transactional
    void deleteBrewResultsById() {
        List<BrewResults> allBrewResults = brewResultsServiceImpl.getAllBrewResults();
        int beforeDeletingMoreBrewResults = allBrewResults.size();

        BrewResults brew2 = allBrewResults.get(0);
        brewResultsServiceImpl.deleteBrewResultsById(brew2.getId());
        int afterDeletingMoreBrewResults = brewResultsServiceImpl.getAllBrewResults().size();

        Assertions.assertThat(afterDeletingMoreBrewResults).isEqualTo(beforeDeletingMoreBrewResults - 1);
        Assertions.assertThat(allBrewResults.contains(brew2));
    }
}


