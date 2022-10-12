package oop.composition;

import java.util.ArrayList;
import java.util.List;

public class Course {

	final String name;
	List<Student> students = new ArrayList<>();

	Course(String name) {
		this.name = name;
	}

	// n to n relatioship
	// a student belongs to n courses
	// a course belongs to n students
	// bidirectional relationship
	void addStudent(Student student) {
		this.students.add(student);
		student.courses.add(this);
	}
}