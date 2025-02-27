package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {
    Instructor saveInstructor(Instructor instructor);

    List<Instructor> listAllInstructor();

    Optional<Instructor> getInstructorById(Long id);
}
