package com.springjpa_learning.springjpa.repository;

import com.springjpa_learning.springjpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingRepository extends JpaRepository<Author , Long> {

}
