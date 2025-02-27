package com.texas.Miniproject.controllers;

import com.texas.Miniproject.entity.Instructor;
import com.texas.Miniproject.services.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    public ResponseEntity<Instructor> save(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.saveInstructor(instructor), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Instructor> listInstructor(){
        return instructorService.listAllInstructor();
    }

    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable Long id){
        return instructorService.getInstructorById(id);
    }
}
