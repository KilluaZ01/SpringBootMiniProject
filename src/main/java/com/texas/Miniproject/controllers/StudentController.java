package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Student;
import com.texas.Miniproject.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/test")
    public String test(){
        return "Hello Texas";
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> list(){
        return studentService.listAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
