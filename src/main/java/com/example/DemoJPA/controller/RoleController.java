package com.example.DemoJPA.controller;


import com.example.DemoJPA.dto.RoleDTO;
import com.example.DemoJPA.entity.RolesEntity;
import com.example.DemoJPA.repository.RoleRepository;
import com.example.DemoJPA.service.RoleServiceImp;
import com.example.DemoJPA.service.imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;
    @GetMapping("")
    public ResponseEntity<?> getAllRole(){

        return new ResponseEntity<>(roleService.getAllRole(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getAllRoleByName(@PathVariable String name){

        return new ResponseEntity<>(roleService.getRoleByName(name), HttpStatus.OK);
    }
}
