package com.zacharski.mateusz.AirportApp.model;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;
}
