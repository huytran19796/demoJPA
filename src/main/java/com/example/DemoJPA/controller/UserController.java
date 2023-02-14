package com.example.DemoJPA.controller;

import com.example.DemoJPA.dto.UserDTO;
import com.example.DemoJPA.entity.UsersEntity;
import com.example.DemoJPA.service.imp.RoleService;
import com.example.DemoJPA.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import payload.LoginResquest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> logIn(@RequestBody LoginResquest loginResquest){
        return new ResponseEntity<>(userService.logIn(loginResquest), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insertUser(@RequestBody LoginResquest loginResquest){
        return new ResponseEntity<>(userService.insertUser(loginResquest), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }
}
