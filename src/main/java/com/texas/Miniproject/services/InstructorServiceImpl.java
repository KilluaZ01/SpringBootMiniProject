package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Instructor;
import com.texas.Miniproject.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> listAllInstructor() {
        return instructorRepository.findAll();
    }

    @Override
    public Optional<Instructor> getInstructorById(Long id) {
        return instructorRepository.findById(id);
    }

}
