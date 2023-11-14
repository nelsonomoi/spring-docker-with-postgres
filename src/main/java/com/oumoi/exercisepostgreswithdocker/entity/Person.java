package com.oumoi.exercisepostgreswithdocker.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_persons")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
