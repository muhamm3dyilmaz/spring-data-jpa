package com.project.spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring_data_jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // ! Domain Specific Language (DSL)
    List<Student> findByName(String name);

    // ! Domain Specific Language (DSL)
    List<Student> findByMark(int mark);

}
