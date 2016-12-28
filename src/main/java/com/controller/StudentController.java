package com.controller;

import com.dao.StudentDao;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("addStudent", "command", new Student());
    }

    @RequestMapping(value = "/addd", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student,
                             ModelMap model) {

        Date date = new Date();
        String currentDate = date.toString();
        student.setTakeInDate(currentDate);

        studentDao.addUser(student);

        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("email", student.getEmail());

        return "print";
    }
}
