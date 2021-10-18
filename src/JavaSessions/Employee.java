package JavaSessions;

public class Employee {
	
	//class --> blueprint/template of all objects
	//class is a concept
	//class template --> create the object
	
	//class vars: will be common for all the objects, but their values will be different
	//class properties
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		
		String name = "Peter";//local variable
		System.out.println(name);

		//create the object: use new keyword
		Employee e1 = new Employee();
		
		e1.name = "Tom";
		e1.age = 20;
		e1.salary = 23.44;
		e1.isActive = true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		
		Employee e2 = new Employee();
		e2.name = "Naveen";
		e2.isActive = false;
		
		System.out.println(e2.name + " "+ e2.age + " " + e2.salary + " " + e2.isActive);
		
		e2.salary = 12.22;
		System.out.println(e2.name + " "+ e2.age + " " + e2.salary + " " + e2.isActive);

		//no ref objects
		new Employee().name = "Lisa";
		new Employee().age = 21;

		Employee e5 = new Employee();
		e5 = null; //null ref objects
		
		System.out.println(e5.name);//NPE

		System.gc(); //wil try to destroy 3 objects
		
	}

}
