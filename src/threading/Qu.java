package threading;

public class Qu {

	int n;
	boolean valueSet = false;
	
	synchronized int get(){
		
		if (valueSet == false){
			
			try{
				wait();
			} catch (Exception e){}
		}
		
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n){
		
		if(valueSet == true){
			
			try{
				wait();
			} catch (Exception e){}
		}
		
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}
