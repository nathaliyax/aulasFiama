package com.example.todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int senha;
}
