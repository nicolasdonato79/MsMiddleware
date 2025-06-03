package com.example.msMiddleware.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_DETAILS", schema = "SANTA_FE")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long userId;

    @Column(name = "USERNAME", length = 255)
    private String username;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "GENDER", length = 10)
    private String gender;

    @Column(name = "PASSWORD", length = 50)
    private String password;

    @Column(name = "STATUS", precision = 3, scale = 0)
    private Integer status;

    @Column(name = "ORIGIN", length = 255)
    private String origin;


}