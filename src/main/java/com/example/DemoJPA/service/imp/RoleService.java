package com.example.DemoJPA.service.imp;

import com.example.DemoJPA.dto.RoleDTO;
import com.example.DemoJPA.entity.RolesEntity;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getAllRole();
    List<RoleDTO> getRoleByName(String name);
}
