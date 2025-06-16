package com.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Entity.Course;
import com.springboot.service.CourseService;

@RestController
public class Courses {
	@Autowired
    CourseService courseService ;
	
	@GetMapping("/Courses")
	public List<Course> getAllCourses() {
		List<Course> list= courseService.getAllCourses();;
		return list;
	}
	
	@PostMapping("/Courses")
	public List<Course> saveAllCourses(@RequestBody List<Course> list) {
		List<Course> c= courseService.saveAllCourses(list);
		return c;
	}
	
	@GetMapping("/Courses/{id}")
	public Course getOneCourse(@PathVariable long id ) {
		Course c= courseService.getOneCourse(id);
		return c;
	}
	
	@DeleteMapping("/Courses/{id}")
	public void getDeleteCourse(@PathVariable long id ) {
		courseService.getDeleteCourse(id);;
		
	}
	
	
	@PutMapping("/Courses")
	public Course getUpdateCourse(@RequestBody Course course ) {
		return courseService.getUpdateCourse(course);
		
	}
}
