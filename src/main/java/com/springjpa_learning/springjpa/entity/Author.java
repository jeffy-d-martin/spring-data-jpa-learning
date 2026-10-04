package com.springjpa_learning.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Long id;
    @Column(
            name = "first_name",
            nullable = false
    )
    private String firstName;
    @Column(
            name = "first_name",
            nullable = false
    )
    private String lastName;
    @Column(
            name = "email" ,
            unique = true ,
            nullable = false
    )
    private String email;
    private int age;
}
