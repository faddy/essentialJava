package stacksAndQueues;

public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testThreeStacks();
		
	}
	
	public static void testStackWithMin(){
		StackWithMin st = new StackWithMin();
		st.push(5);
		st.push(3);
		st.push(8);
		System.out.println(st);
		
		try{
		    System.out.println( st.min() );
		} catch (Exception e) {
			System.out.println( e.getStackTrace() );
		}
	}
	
	public static void testQueuesWithStacks(){
		QueuesWithStacks q = new QueuesWithStacks();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(8);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(7);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
	
	public static void testThreeStacks(){
		ThreeStacks stack = new ThreeStacks(20);
		stack.push(0, 2);
		stack.push(0, 6);
		stack.push(0, 5);
		stack.push(1, 9);
		stack.push(2, 20);
		
		stack.printSt();
	}

}
