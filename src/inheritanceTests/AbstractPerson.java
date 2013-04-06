package inheritanceTests;

public abstract class AbstractPerson {

	private static int totalPersons;
	
	private String name;
	private int age;
	
	public AbstractPerson(String name) throws TooManyPersonsException {
		if (totalPersons == 3) {
			throw new TooManyPersonsException();
		}
		this.name = name;
		totalPersons++;
	}
	
	public int getTotalPersons(){
		return totalPersons;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void printDetails(){
		System.out.println("name: " + name + ", age: " + age);
	}
}
