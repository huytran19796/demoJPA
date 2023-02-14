package com.example.DemoJPA.service;

import com.example.DemoJPA.dto.UserDTO;
import com.example.DemoJPA.entity.RolesEntity;
import com.example.DemoJPA.entity.UsersEntity;
import com.example.DemoJPA.repository.RoleRepository;
import com.example.DemoJPA.repository.UserRepository;
import com.example.DemoJPA.service.imp.UserService;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import payload.LoginResquest;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public boolean logIn(LoginResquest loginResquest) {
        return userRepository.findByEmailAndPassword(loginResquest.getEmail(), loginResquest.getPassword()).size() > 0;
    }

    @Override
    public boolean insertUser(LoginResquest loginResquest) {
        List<RolesEntity> list_role = roleRepository.findByName(loginResquest.getNameRole());
        RolesEntity role = null;
        if (list_role.size() > 0){
            role = list_role.get(0);
        }
        if (role != null){
            UsersEntity newUser = new UsersEntity();
            newUser.setEmail(loginResquest.getEmail());
            newUser.setPassword(loginResquest.getPassword());
            newUser.setFullname(loginResquest.getFullName());
            newUser.setRoles(role);
            userRepository.save(newUser);
            return true;
        }
        return false;
    }

    @Override
    public boolean saveUser(UserDTO userDTO){
        RolesEntity role = new RolesEntity();
        role.setId(userDTO.getRoleId());

        UsersEntity users = new UsersEntity();
        users.setEmail(userDTO.getEmail());
        users.setPassword(userDTO.getPassword());
        users.setFullname(userDTO.getFullname());
        users.setAvatar(userDTO.getAvatar());
        users.setRoles(role);
        try{
            userRepository.save(users);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> list = new ArrayList<>();
        for (UsersEntity user: userRepository.getAllUser()){
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullname(user.getFullname());
            userDTO.setAvatar(user.getAvatar());
            list.add(userDTO);
        }
        return list;
    }
}
