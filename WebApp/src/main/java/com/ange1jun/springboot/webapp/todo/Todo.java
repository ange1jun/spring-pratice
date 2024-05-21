package com.ange1jun.springboot.webapp.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Todo {
    public Todo(int id, String username, String description, LocalDate targetdate, Boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.done = done;
    }

    public Todo(){

    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Size (min=10, message = ("Enter atleast 10 character!"))
    @Column(name = "description")
    private String description;
    @Column(name = "target_date")
    private LocalDate targetdate;
    @Column(name = "done")
    private Boolean done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetdate=" + targetdate +
                ", done=" + done +
                '}';
    }
}
