package com.springjpa_learning.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "author_details")
public class Author {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequences"
    )
    @SequenceGenerator(
            name = "author_sequences" ,
            sequenceName = "a_s",
            allocationSize = 2
    )
    @Column(
            name = "author_id"
    )
    private Long id;
    @Column(
            name = "first_name",
            nullable = false
    )
    private String firstName;
    @Column(
            name = "last_name",
            nullable = false
    )
    private String lastName;
    @Column(
            name = "email" ,
            unique = true ,
            nullable = false
    )
    private String email;
    @Column(
            name = "age",
            nullable = false
    )
    private int age;
    @ManyToMany
    @JoinTable(
            name = "course_authors",
            joinColumns = {
                    @JoinColumn(name = "author_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id")
            }
    )
    private List<Course> courses;
}
