// package oo.abstractclass.jungle;

public class JungleTest {

	public static void main(String[] args) {

		Mammal dog = new Dog();

		System.out.println(dog.move());
		System.out.println(dog.suckle());
		System.out.println(dog.breath());		

	}
}