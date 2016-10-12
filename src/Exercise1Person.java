
public class Exercise1Person {

	public static void main(String[] args) {
		
		try{
			Person p = new PersonBuilder().withName("name1").withAge(30).build();
			System.out.println(p);
			System.out.println(p.getThisPersonWithOtherName("newName"));
			System.out.println(p);
		}
		catch(Exception e){
			System.out.println(e);
			e.getMessage();//nie dzia³a
		}
		
		try{
			Person p2 = new PersonBuilder().withName("name2").withAge(32).build();
			System.out.println(p2);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
