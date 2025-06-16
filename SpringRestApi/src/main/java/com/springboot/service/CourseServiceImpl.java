package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.Course;
import com.springboot.Repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
	CourseRepository courseRepository;
	@Override
	public List<Course> getAllCourses() {
		List<Course> list =courseRepository.findAll();
		return list;
	}
	
	@Override
	public List<Course> saveAllCourses(List<Course> list) {
		for(Course course:list) {
		courseRepository.save(course);
		}
		return list;
	}

	@Override
	public Course getOneCourse(long id) {
		return courseRepository.findById(id);
		
	}

	@Override
	public void getDeleteCourse(long id) {
		courseRepository.deleteById(id);
	}
	
	   public Course getUpdateCourse(Course course) {
		   return courseRepository.save(course);
	   }
	

}
