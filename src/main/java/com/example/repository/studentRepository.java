package com.example.repository;

import com.example.model.Student;

import java.util.List;

/**
 * Created by PankajShinde on 10/18/2018.
 */
public interface studentRepository {

    List<Student> getStudents();
    void insertStudent();
    void deleteStudent();
    void updateStudent();

}
