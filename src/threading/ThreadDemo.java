package threading;

public class ThreadDemo {
	public static void main(String[] args){
		MyThread t = new MyThread("First");
		t.setPriority(9);
		t.start();
		
		Thread thisThread = Thread.currentThread();
		thisThread.setPriority(9);
		System.out.println(thisThread);
				
		for (int i=0; i<5; i++){
			System.out.println("Main thread " + i);
			try{
				Thread.sleep(1000);
			} catch (Exception e){
				System.out.println("Main thread was interrupted");
			}
		}
		System.out.println("Exiting main thread...");
	}
}
