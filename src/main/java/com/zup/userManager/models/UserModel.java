package com.zup.userManager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "users")
public class UserModel{

    @Id
    @UuidGenerator
    private String id;
    private String userName;
    private String password;

    public UserModel() {
    }
    
}
