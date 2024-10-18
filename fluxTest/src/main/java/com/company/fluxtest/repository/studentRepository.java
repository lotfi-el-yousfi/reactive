package com.company.fluxtest.repository;

import com.company.fluxtest.domain.entity.studentEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository
        extends ReactiveCrudRepository<studentEntity, Long> {
}
