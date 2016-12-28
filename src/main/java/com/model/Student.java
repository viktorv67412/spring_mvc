package com.model;

public class Student {

    private String name;
    private int age;
    private String email;
    private String takeInDate;

    public Student(String name, int age, String email, String takeInDate) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.takeInDate = takeInDate;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTakeInDate() {
        return takeInDate;
    }

    public void setTakeInDate(String takeInDate) {
        this.takeInDate = takeInDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", takeInDate='" + takeInDate + '\'' +
                '}';
    }
}
