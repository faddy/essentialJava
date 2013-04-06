package threading;

public class Producer implements Runnable {

	Qu q;
	
	public Producer(Qu q){
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	public void run(){
		
		int i=0;
		while(i<10){
			q.put(i++);
		}
	}
}
