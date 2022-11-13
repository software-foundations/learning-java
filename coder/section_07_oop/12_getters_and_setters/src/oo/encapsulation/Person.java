package oo.encapsulation;

public class Person {

	private String name;
	private String lastName;
	private int age;

	public Person(String name, String lastName, int age) {
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return this.getName() + " " + this.getLastName();
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		age = Math.abs(age);

		if(age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Hello, my name is "+
			this.getName() +
			", and I have "+
			this.getAge() + " years old.";
	}
}