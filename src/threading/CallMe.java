package threading;

public class CallMe {
	
	void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(2000);
		} catch (Exception e){
			System.out.println("caught an exception");
		}
		System.out.println("]");
	}
}
