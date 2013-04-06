package stacksAndQueues;


/**
 * @author fahad
 * Implementing three stacks with a single array.
 * The array is divided between the 3 stacks equally.
 */
public class ThreeStacks {

	Object[] buffer;
	int[] topArr = new int[3];
	
	public ThreeStacks(int N){
		buffer = new Object[N];
		for (int i=0; i<3; i++){
			topArr[i] = i*(N/3);
		}
	}

	public Object pop(int st){
		// if top == l_limit, return
		// else:
		//     item = buffer[top]
		//     top--
		//     return item
		int top = topArr[st];
		int lowerLimit = (st*buffer.length)/3;
		if (top == lowerLimit) return null;
		else {
			Object item = buffer[top];
			topArr[st]--;
			return item;
		}
	}
	
	public void push(int st, Object obj){
		// if top == u_limit, return
		// else:
		//     buffer[top] = obj
		//     top++
		int top = topArr[st];
		int upperLimit = (st+1)*(buffer.length)/3;
		System.out.println(top + ", " + upperLimit);
		if (top == upperLimit) return;
		else {
			buffer[top] = obj;
			topArr[st]++;
		}
	}
	
	
	public void printSt(){
		
		System.out.println("Printing...");
		for (int i=0; i<buffer.length; i++) {
			if (i%(buffer.length/3)==0) System.out.println();
			System.out.print( buffer[i] + ", ");
		}
		System.out.println();
	}
}
