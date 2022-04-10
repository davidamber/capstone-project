package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import java.util.List;

public interface UserListService {
    List < UserList > getAllUserLists();
    void saveUserList(UserList userList);
    UserList getUserListById(long id);
    void deleteUserListById(long id);
}