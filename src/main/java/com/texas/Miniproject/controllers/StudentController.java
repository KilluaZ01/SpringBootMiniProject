package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Student;
import com.texas.Miniproject.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student)
    {
        return new ResponseEntity<>(studentService.update(student),HttpStatus.OK);
    }

}
