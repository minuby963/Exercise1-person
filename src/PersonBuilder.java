
public class PersonBuilder {
	private Person person;

	public PersonBuilder() {
		person = new Person();
	}

	public Person build() throws Exception {
		if (person.getName() == null) {
			throw new Exception("Name undefinied.");
		}
		if (person.getAge() == 0) {
			throw new Exception("Age undefinied.");
		}
		return new Person(person.getName(), person.getAge());
	}

	public PersonBuilder withAge(int age) {
		person.setAge(age);
		return this;
	}

	public PersonBuilder withName(String name) {
		person.setName(name);
		return this;
	}

}
