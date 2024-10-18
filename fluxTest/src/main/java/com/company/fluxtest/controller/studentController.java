package com.company.fluxtest.controller;

import com.company.fluxtest.domain.entity.studentEntity;
import com.company.fluxtest.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/student")
public class studentController {

    @Autowired
    private studentService service;

    @GetMapping("")
    public Flux<studentEntity> addStrudent() {
        return this.service.GetAllStudents()
                .delayElements(
                        Duration.ofMillis(100)
                );
        );
    }

    @PostMapping("/save")
    public Mono<studentEntity> addStrudent(@RequestBody studentEntity student) {
        return this.service.save(student);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteStudentById(@PathVariable Long id) {
        return this.service.deleteStudentById(id);
    }

    @DeleteMapping("")
    public Mono<Void> deleteAllStudents() {
        return this.service.deleteAllStudents();
    }
}
