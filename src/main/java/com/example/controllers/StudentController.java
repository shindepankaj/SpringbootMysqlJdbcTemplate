package com.example.controllers;

import com.example.impl.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by PankajShinde on 10/18/2018.
 */
@RestController
public class StudentController {

    @Autowired
    StudentImpl studentImpl;

    @RequestMapping(value="/getStudents")
    List getStudents() {
        return studentImpl.getStudents();
    }

    @RequestMapping(value="/insertStudent")
    void insertStudent() {
        studentImpl.insertStudent();
    }

    @RequestMapping(value="/deleteStudent")
    void deleteStudent() {
        studentImpl.deleteStudent();
    }

    @RequestMapping(value="/updateStudent")
    void updateStudent() {
        studentImpl.updateStudent();
    }

}
