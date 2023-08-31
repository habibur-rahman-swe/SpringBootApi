package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	List<Courses> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(1, "A", "B"));
		list.add(new Courses(2, "A", "B"));
		list.add(new Courses(3, "A", "B"));
		list.add(new Courses(4, "A", "B"));
		list.add(new Courses(5, "A", "B"));
	}
	
	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourses(long courseId) {
		for (Courses course : list) {
			if (course.getId() == courseId) {
				return course;
			}
		}
		return new Courses();
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

}
