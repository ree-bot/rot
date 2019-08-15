package com.bba.web;

import com.bba.config.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Stu {
    @Autowired
    Student student;

}
