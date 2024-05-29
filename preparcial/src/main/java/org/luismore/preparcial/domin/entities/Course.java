package org.luismore.preparcial.domin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_course;
    private String name;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "creator_id")
    private User creator;
    
    @ManyToMany(mappedBy = "takenCourses", fetch = FetchType.LAZY)
    private List<User> participants;

    @ManyToMany(mappedBy = "assistedCourses", fetch = FetchType.LAZY)
    private List<User> assistants;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Assignment> assignments;

}
