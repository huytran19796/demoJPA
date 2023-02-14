package com.example.DemoJPA.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "task")
public class TasksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "users")
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "jobs")
    private JobsEntity job;

    @ManyToOne
    @JoinColumn(name = "status")
    private StatusEntity status;

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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public JobsEntity getJob() {
        return job;
    }

    public void setJob(JobsEntity job) {
        this.job = job;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }
}
