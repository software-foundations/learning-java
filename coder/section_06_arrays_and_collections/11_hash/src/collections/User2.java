package collections;

import java.util.Objects;

public class User2 {

	String name;

	User2(String name){
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
		User2 user = (User2) o;
		return name.equals(user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}