package com.springjpa_learning.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(
        name = "courses_details"
)
public class Course {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "courses_id"
    )
    @SequenceGenerator(
            name = "courses_id",
            sequenceName = "c_s",
            allocationSize = 2
    )
    @Column(
            name = "course_id"
    )
    private Long id;

    @Column(
            name = "course_name"
    )
    private String name;

    @Column(
            name = "course_description"
    )
    private String description;
    @ManyToMany(
            mappedBy = "courses"
    )
    private List<Author> authors;
}
