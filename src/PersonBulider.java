
public class PersonBulider {
	private Person person;

	public PersonBulider() {
		person = new Person();
	}

	public Person bulid() throws Exception {
		if (person.getName() == null) {
			throw new Exception("Name not definied.");
		}
		if (person.getAge() == 0) {
			throw new Exception("Age not definied.");
		}
		return person;
	}

	public PersonBulider withAge(int age) {
		person.setAge(age);
		return this;
	}

	public PersonBulider withName(String name) {
		person.setName(name);
		return this;
	}

}
