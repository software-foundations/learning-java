package collections;

import java.util.Objects;

public class User {

	String name;

	User(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "My name is " + this.name + ".";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return name.equals(user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}