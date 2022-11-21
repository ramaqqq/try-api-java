package com.domain.models.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tryapi")

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 200)
    private String username;
    @Column(name = "sender", length = 200)
    private String sender;
    @Column(name = "password", length = 200)
    private String password;

    public User() {
    }

    public User(Long id, String username, String sender, String password) {
        this.id= id;
        this.username= username;
        this.sender= sender;
        this.password= password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
