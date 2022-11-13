package oo.encapsulation;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person("Bruno", "Conde", -45);
		p1.setAge(230);

		System.out.println(p1.getAge());
		System.out.println(p1);
		System.out.println(p1.getFullName());
	}
}