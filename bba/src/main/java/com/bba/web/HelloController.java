package com.bba.web;

import com.bba.config.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    DataSource dataSource;
    @Autowired
    Student stu;
    @GetMapping("HELLO")
    public String HELO(){
        return stu.getName()+stu.getAge()+"哦嚯,springboot";
    }

}
