package com.example.StudentsProject.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.StudentsProject.entities.Student;
import com.example.StudentsProject.services.StudentServices;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        studentServices.addStudent(student);
    }

    @DeleteMapping("/delete")
    public void deleteStudents(@RequestBody List<Long> ids) {
        studentServices.deleteStudents(ids);
    }

    @GetMapping("/list")
    public List<Student> listStudents() {
        return studentServices.listeStudents();
    }

    @GetMapping("/get-by-family-name")
    public Student getStudentByFamilyName(@RequestParam String familyName){
        return studentServices.getStudentByFamilyName(familyName);
    }
}