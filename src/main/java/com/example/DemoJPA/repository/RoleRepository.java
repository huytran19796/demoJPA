package com.example.DemoJPA.repository;

import com.example.DemoJPA.dto.RoleDTO;
import com.example.DemoJPA.entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
// JpaRepository<RolesEntity, Integer>: Tham số đầu tiên: tên Entity. Tham số thứ hai: Kiểu dữ liệu khóa chính
// @Component, @Service, @Repository, @Bean thuong khai bao o @Configuration

@Repository
public interface RoleRepository extends JpaRepository<RolesEntity, Integer> {
    List<RolesEntity> findByName(String name);
}

// Tao User COntroller, chuc nang them user - lay user theo email va password

