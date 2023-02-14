package com.example.DemoJPA.service;

import com.example.DemoJPA.dto.RoleDTO;
import com.example.DemoJPA.entity.RolesEntity;
import com.example.DemoJPA.repository.RoleRepository;
import com.example.DemoJPA.service.imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleDTO> getAllRole(){
        List<RolesEntity> list = roleRepository.findAll();
        List<RoleDTO> dtos = new ArrayList<>();
        for (RolesEntity data: list){
            RoleDTO dto = new RoleDTO(data.getId(), data.getName(), data.getName());
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public List<RoleDTO> getRoleByName(String name){
        List<RolesEntity> list = roleRepository.findByName(name);
        List<RoleDTO> dtos = new ArrayList<>();
        for (RolesEntity data: list){
            RoleDTO dto = new RoleDTO(data.getId(), data.getName(), data.getName());
            dtos.add(dto);
        }
        return dtos;
    }

}
