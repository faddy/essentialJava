package inheritanceTests;

public class PersonFactory {

	private PersonFactory(){}
	
	public static AbstractPerson createPerson(String name, String gender) throws TooManyPersonsException {
		
		if ("male".equals(gender)){
			return new Male(name);
		}
		else {
			return new Female(name);
		}
	}
}
