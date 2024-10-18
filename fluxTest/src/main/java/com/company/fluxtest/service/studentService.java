package com.company.fluxtest.service;

import com.company.fluxtest.domain.entity.studentEntity;
import com.company.fluxtest.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class studentService {

    @Autowired
    private studentRepository repository;

    public Flux<studentEntity> GetAllStudents() {
        return repository.findAll();
    }

    public Mono<studentEntity> save(studentEntity student) {
        return repository.save(student);
    }

    public Mono<Void> deleteStudentById(Long id) {
        return repository.deleteById(id);
    }

    public Mono<Void> deleteAllStudents() {
        return repository.deleteAll();
    }
}
