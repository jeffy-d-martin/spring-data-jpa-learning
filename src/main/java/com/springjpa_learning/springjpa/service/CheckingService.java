package com.springjpa_learning.springjpa.service;

import com.springjpa_learning.springjpa.dto.User;
import com.springjpa_learning.springjpa.entity.Author;
import com.springjpa_learning.springjpa.repository.CheckingRepository;
import org.springframework.stereotype.Service;

@Service
public class CheckingService {
    private final CheckingRepository checkingRepository;

    public CheckingService(CheckingRepository checkingRepository) {
        this.checkingRepository = checkingRepository;
    }

    public void addUser(User user){
        Author author = new Author();
        author.setFirstName(user.getFirstName());
        author.setLastName(user.getLastName());
        author.setEmail(user.getEmail());
        author.setAge(user.getAge());
        checkingRepository.save(author);
    }
}
