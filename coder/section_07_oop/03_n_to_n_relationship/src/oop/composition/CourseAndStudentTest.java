package oop.composition;

public class CourseAndStudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Bruno");
		Student student2 = new Student("Lisa");
		Student student3 = new Student("Peter");

		Course course1 = new Course("Computer Science");
		Course course2 = new Course("Medicine");
		Course course3 = new Course("Nursing");

		course1.addStudent(student1);
		course1.addStudent(student2);

		course2.addStudent(student1);
		course2.addStudent(student3);

		student1.addCourse(course3);
		student2.addCourse(course3);
		student3.addCourse(course3);

		for(Student student: course3.students) {
			System.out.println("Course " + course3.name);
			System.out.println("... " + student.name);
			System.out.println();
		}

		System.out.println(student1.courses.get(0).students);

		Course foundCourse = student1.getCourseByName("Medicine");

		if(foundCourse != null) {
			System.out.println(foundCourse.name);
			System.out.println(foundCourse.students);
		}
	}
}