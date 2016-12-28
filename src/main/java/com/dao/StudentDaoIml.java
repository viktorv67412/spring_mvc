package com.dao;

import com.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("studentDao")
public class StudentDaoIml implements StudentDao {

    private List<Student> students = new ArrayList<Student>(Arrays.asList(new Student("name1", 12, "name1@gmail.com", "some_date"),
            new Student("name2", 14, "name2@gmail.com", "some date")));

    public List<Student> getAllUsers() {
        return students;
    }

    public List<Student> addUser(Student newUser) {
        students.add(newUser);
        return students;
    }
}
