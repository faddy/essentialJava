package threading;

public class Consumer implements Runnable {

	Qu q;
	
	public Consumer(Qu q){
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	
	public void run(){
		
		int i=0;
		while (true){
			q.get();
		}
	}
}
