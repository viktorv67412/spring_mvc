package com.dao;

import com.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllUsers();

    List<Student> addUser(Student newUser);
}
