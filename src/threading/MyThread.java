package threading;



public class MyThread extends Thread {
	
	public MyThread(String name){
		this.setName(name);
		System.out.println("    Child thread " + this);
	}
	
	public void run(){
		
		for (int i=0; i<5; i++){
			System.out.println("    Child thread " + i);
			Thread.dumpStack();
			try{
				Thread.sleep(10000);
			} catch (Exception e){
				System.out.println("    Child was interrupted");
			}
		}
		
		System.out.println("    Exiting child thread...");
	}
}
