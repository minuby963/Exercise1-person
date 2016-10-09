
public class Exercise1Person {

	public static void main(String[] args) {
		
		try{
			Person p = new PersonBulider().withName("name1").withAge(30).bulid();
			System.out.println(p);
		}
		catch(Exception e){
			System.out.println(e);
			e.getMessage();//nie dzia³a
		}
		
		try{
			Person p2 = new PersonBulider().withAge(32).bulid();
			System.out.println(p2);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
