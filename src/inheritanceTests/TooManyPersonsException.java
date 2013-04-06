package inheritanceTests;

public class TooManyPersonsException extends Exception {

	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return "Too many persons already in the system";
	}
}
