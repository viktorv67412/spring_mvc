package com.controller;

import com.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/statistics")
public class StatisticController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "/list")
    public String getAllUsers(Model model) {

        model.addAttribute("students", studentDao.getAllUsers());

        // Just to check GlobalExceptionHandlingClass
        if (true) {
            throw new NullPointerException();
        }

        return "getAllStudents";
    }
}
