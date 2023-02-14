package com.example.DemoJPA.service.imp;

import com.example.DemoJPA.dto.UserDTO;
import com.example.DemoJPA.entity.RolesEntity;
import com.example.DemoJPA.entity.UsersEntity;
import payload.LoginResquest;

import java.util.List;

public interface UserService {
    boolean logIn(LoginResquest loginResquest);
    boolean insertUser(LoginResquest loginResquest);
    boolean saveUser(UserDTO userDTO);
    List<UserDTO> getAllUser();
}
