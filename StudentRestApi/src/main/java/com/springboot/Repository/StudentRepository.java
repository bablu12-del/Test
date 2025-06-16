package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
