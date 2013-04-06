package stacksAndQueues;

public class CollectionEmptyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String getMessage(){
		return "The collection is empty";
	}
}
