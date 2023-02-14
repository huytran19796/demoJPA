package com.example.DemoJPA.repository;

import com.example.DemoJPA.entity.RolesEntity;
import com.example.DemoJPA.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UsersEntity, Integer> {
    List<UsersEntity> findByEmailAndPassword(String email, String password);

    @Query("select a from users as a ")
    List<UsersEntity> getAllUser();
}
