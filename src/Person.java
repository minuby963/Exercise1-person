
public class Person {
	private String name;
	private int age;

	public Person() {

	}

	@Override
	public String toString() {
		return "name: " + name + "\nage: " + age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
