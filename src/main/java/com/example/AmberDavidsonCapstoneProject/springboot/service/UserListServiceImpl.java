package com.example.AmberDavidsonCapstoneProject.springboot.service;

import java.util.List;
import java.util.Optional;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.UserListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserListServiceImpl implements UserListService {

    @Autowired
    private UserListRepository userListRepository;

    @Override
    public List <UserList> getAllUserLists() {
        return userListRepository.findAll();
    }

    @Override
    public void saveUserList(UserList userList) {
        this.userListRepository.save(userList);
    }

    @Override
    public UserList getUserListById(long id) {
        Optional < UserList > optional = userListRepository.findById(id);
        UserList userList = null;
        if (optional.isPresent()) {
            userList = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return userList;
    }

    @Override
    public void deleteUserListById(long id) {
        this.userListRepository.deleteById(id);
    }
}