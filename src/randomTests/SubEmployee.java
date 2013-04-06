package randomTests;

public class SubEmployee extends Employee {

	public SubEmployee(String name){
		super(name);
	}
	
	public void setDesignation(String designation){
		super.setDesignation(designation);
		System.out.println("this is the subclass method");
	}
}
