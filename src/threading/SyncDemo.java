package threading;

public class SyncDemo {

	public static void main(String args[]){
		CallMe target = new CallMe();
		Caller c1 = new Caller("Hello", target);
		Caller c2 = new Caller("synchronized", target);
		Caller c3 = new Caller("world", target);
		
		try{
			c1.t.join();
			c2.t.join();
			c3.t.join();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
