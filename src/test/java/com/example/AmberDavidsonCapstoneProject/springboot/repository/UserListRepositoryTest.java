package com.example.AmberDavidsonCapstoneProject.springboot.repository;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
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
    void findFirstByLastName_should_return_User_given_valid_lastname() {

        User davidson = userListRepository.findFirstByLastName("Davidson");
        Assertions.assertThat(davidson.getLastName()).isEqualTo("Davidson");
    }
}
