package com.texas.Miniproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instructor")
public class Instructor {
    @Id
    @SequenceGenerator(name = "instructor_sequence", sequenceName = "instructor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_sequence")
    private Long id;
    private String name;
    private String email;
    private String phone;

    @ManyToOne
    private Department department;
}
