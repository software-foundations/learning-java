package oop.composition;

import java.util.ArrayList;
import java.util.List;

public class Student {

	final String name;
	List<Course> courses = new ArrayList<>();

	Student(String name) {
		this.name = name;
	}

	// n to n relatioship
	// a student belongs to n courses
	// a course belongs to n students
	// bidirectional relationship
	void addCourse(Course course) {
		this.courses.add(course);
		course.students.add(this);
	}

	Course getCourseByName(String name) {
		for(Course course: this.courses) {
			if (course.name.equalsIgnoreCase(name)) {
				return course;
			}
		}
		return null;	
	}

	// This method is called always we want to convert a object to string
	public String toString() {
		return this.name;
	}
}