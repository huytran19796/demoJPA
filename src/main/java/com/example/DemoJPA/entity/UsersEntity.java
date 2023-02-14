package com.example.DemoJPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.core.SpringVersion;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "avatar")
    private String avatar;

//    @Column(name = "roleId")
//    private int roleId;
    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnore
    private RolesEntity roles;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<TasksEntity> tasks;

    public Set<TasksEntity> getTasks() {
        return tasks;
    }

    public void setTasks(Set<TasksEntity> tasks) {
        this.tasks = tasks;
    }

    public RolesEntity getRoles() {
        return roles;
    }

    public void setRoles(RolesEntity roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

//    public int getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(int roleId) {
//        this.roleId = roleId;
//    }
}
