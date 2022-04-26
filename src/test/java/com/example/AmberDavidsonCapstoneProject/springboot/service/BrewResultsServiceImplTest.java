package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.BrewResultsRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BrewResultsServiceImplTest {

    @Autowired
    private BrewResultsServiceImpl brewResultsServiceImpl;

    @Test
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
        Assertions.assertThat(allBrewResults.contains(brew1));
    }

    @Test
    void deleteBrewResultsById() {
        List<BrewResults> allBrewResults = brewResultsServiceImpl.getAllBrewResults();
        int beforeDeletingMoreBrewResults = allBrewResults.size();

        BrewResults brew1 = allBrewResults.get(0);
        brewResultsServiceImpl.deleteBrewResultsById(brew1.getId());
        int afterDeletingMoreBrewResults = brewResultsServiceImpl.getAllBrewResults().size();

        Assertions.assertThat(afterDeletingMoreBrewResults).isEqualTo(beforeDeletingMoreBrewResults - 1);
        Assertions.assertThat(allBrewResults.contains(brew1));
    }
}

//    @Test
//    void findFirstByLastName_should_return_Employee_given_valid_lastname() {
//
//        Employee jones = employeeRepository.findFirstByLastName("Jones");
//        Assertions.assertThat(jones.getLastName()).isEqualTo("Jones");
//    }

