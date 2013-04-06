package inheritanceTests;

public class Female extends AbstractPerson {

	public Female(String name) throws TooManyPersonsException {
		super(name);
	}
	
	public void extraMethod(){
		System.out.println("this is the extra method");
	}
}
