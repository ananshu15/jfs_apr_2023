package com.example.iplplayerstats.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name="team")
    private String team;
    @Column(name="role")
    private String role;
    @Column(name="country")
    private String country;
    @Column(name="amount")
    private double amount;
}
