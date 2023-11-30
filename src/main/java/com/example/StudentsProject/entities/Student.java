package com.example.StudentsProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;



@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String familyName;
    private String name;
    private int age;

    public Student(String familyName, String name, int age) {
        this.familyName = familyName;
        this.name = name;
        this.age = age;
    }
}
