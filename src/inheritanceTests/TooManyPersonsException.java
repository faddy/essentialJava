package inheritanceTests;

public class TooManyPersonsException extends Exception {

	public String getMessage(){
		return "Too many persons already in the system";
	}
}
