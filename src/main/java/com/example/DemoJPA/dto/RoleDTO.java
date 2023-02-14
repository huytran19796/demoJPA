package com.example.DemoJPA.dto;

public class RoleDTO {
    private int id;
    private String name;
    private String desc;

    public RoleDTO(){

    }

    public RoleDTO(int id, String name, String des){
        this.id = id;
        this.name = name;
        this.desc = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String description) {
        this.desc = description;
    }
}
