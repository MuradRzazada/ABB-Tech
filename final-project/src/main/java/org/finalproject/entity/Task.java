package org.finalproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private String priority;
    @Column(name = "user_id")
    private int userId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
