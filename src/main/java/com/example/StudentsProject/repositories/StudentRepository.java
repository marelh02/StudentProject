package com.example.StudentsProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsProject.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Méthodes spécifiques au repository si nécessaire
    Student findStudentByFamilyName(String familyName);
}