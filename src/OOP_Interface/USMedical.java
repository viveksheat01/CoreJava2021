package OOP_Interface;

public interface USMedical extends WHO{
	
	static final int min_fee = 10;
	//vars are static and final by default
	
	//we can not create the object of interface
	//abstract method -- a method which doesnt have any method body
	//prototype mehtod -- only decalaration - no method body
	
	public void physioServices();

	public void oncologyServices();

	public void dentalServices();
	
	public void dermaServices();
	
	public void emergencyServices();
	
	//after JDK 8:
	

}
