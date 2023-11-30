package com.example.StudentsProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentsProject.entities.Student;
import com.example.StudentsProject.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository er;

    public void addStudent(Student Student){
        er.save(Student);
    }

    public void deleteStudents(Iterable<Long> ids){
        er.deleteAllById(ids);
    }

    public List<Student> listeStudents(){
        return er.findAll();
    }

    public Student getStudentByFamilyName(String familyName){
        return er.findStudentByFamilyName(familyName);
    }

}
