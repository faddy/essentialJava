package threading;

/*
 * A class which stores an integer value 'n'
 * The getter and setter methods of 'n' are synchronized
 * i.e. only one thread at a time can modify the variable
 * 
 * After a 'producer' thread sets the value of n
 * a 'consumer' thread can consume its value and unset it.
 * */
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
