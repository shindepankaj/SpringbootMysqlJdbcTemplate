package com.example.impl;

import com.example.model.Student;
import com.example.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PankajShinde on 10/18/2018.
 */
@Repository
public class StudentImpl implements studentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudents() {
        String sql = "select * from student";
//        List list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
        List list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @Override
    public void insertStudent() {
        jdbcTemplate.update("INSERT INTO student (id, name, city) VALUES (?, ?, ?)", 5, "eee", "nashik");
    }

    @Override
    public void deleteStudent() {
        jdbcTemplate.update("DELETE FROM student WHERE id = ?", 5);
    }

    @Override
    public void updateStudent() {
        jdbcTemplate.update("UPDATE student SET city = ? WHERE id = ?", "delhi", 4);
    }

}
