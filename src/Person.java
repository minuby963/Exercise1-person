
public class Person {
	private String name;
	private int age;
	
	public Person() {

	}

	public Person(String name, int age) {
		setName(name);
		setAge(age);
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
	
	public Person getThisPersonWithOtherName(String newName){
		return new Person(newName, age);
	}
	
	public Person toUpperCase2(){
		name = name.toUpperCase();
		return this;
	}

}
