package com.estiben.curso.springboot.webapp.springboot_web.dto;

import com.estiben.curso.springboot.webapp.springboot_web.models.User;

public class UserDTO {
    private String title;
    private String name;
    private User user;
    
    public UserDTO(String title,  String name, User user) {
        this.title = title;
        this.user = user;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
}
