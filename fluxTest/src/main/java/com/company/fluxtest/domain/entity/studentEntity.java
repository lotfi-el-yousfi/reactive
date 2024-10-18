package com.company.fluxtest.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class studentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private String adress;
    private short age;
}
