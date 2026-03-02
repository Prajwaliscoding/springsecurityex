package com.prajwal.springsecurityex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Prajwal", 58),
            new Student(2, "Akkt", 97),
            new Student(3, "Joseph", 90)
    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

}
