package com.example.AmberDavidsonCapstoneProject.springboot.repository;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserListRepository extends JpaRepository<UserList, Long>{

    User findFirstByLastName(String davidson);
}