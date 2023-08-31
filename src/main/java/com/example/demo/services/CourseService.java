package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();

	public Courses getCourses(long l);

	public Courses addCourse(Courses course);
	
}
