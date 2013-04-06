package threading;

public class Caller implements Runnable {

	public String msg;
	public CallMe target;
	public Thread t;
	
	public Caller(String msg, CallMe targ){
		this.msg = msg;
		this.target = targ;
		this.t = new Thread(this);
		t.start();
	}
	
	public void run(){
		synchronized (target) {
			target.call(msg);
		}
	}
}
