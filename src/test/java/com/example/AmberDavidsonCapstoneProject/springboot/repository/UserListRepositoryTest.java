package com.example.AmberDavidsonCapstoneProject.springboot.repository;

import com.example.AmberDavidsonCapstoneProject.springboot.security.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserListRepositoryTest {

    @Autowired
    private UserListRepository userListRepository;

    @Test
    void findFirstByLastName_should_return_Employee_given_valid_lastname() {

        User Davidson = userListRepository.findFirstByLastName("Davidson");
        Assertions.assertThat(Davidson.getLastName()).isEqualTo("Davidson");
    }
}

//@SpringBootTest
//class EmployeeRepositoryTest {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Test
//    void findFirstByLastName_should_return_Employee_given_valid_lastname() {
//
//        Employee jones = employeeRepository.findFirstByLastName("Jones");
//        Assertions.assertThat(jones.getLastName()).isEqualTo("Jones");
//    }
//}