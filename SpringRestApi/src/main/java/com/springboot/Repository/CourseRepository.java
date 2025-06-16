package com.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

	List<Course> findAll();
	Course findById(long id);
	Course deleteById(long id);

}
