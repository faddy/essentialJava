package threading;

public class PCFixed {
	
	public static void main(String[] args){
		Qu q = new Qu();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		System.out.println("Press Ctrl-c to stop");
	}

}
