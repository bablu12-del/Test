package com.springboot.service;

import java.util.List;



import com.springboot.Entity.Course;

public interface CourseService {

	List<Course> getAllCourses();

	List<Course> saveAllCourses(List<Course> course);
	
	Course getOneCourse(long id);
	
    void getDeleteCourse(long id);
    
    Course getUpdateCourse(Course course);

}
