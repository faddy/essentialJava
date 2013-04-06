package stacksAndQueues;
/*
 * Implementing a fifo queue from two lifo stacks
 *  
 * */
public class QueuesWithStacks {
	
	Stack stackA;
	Stack stackB;
		
	public QueuesWithStacks() {
		stackA = new Stack();
		stackB = new Stack();
		stackA.top = null;
		stackB.top = null;
	}
	
	public Object dequeue(){
		// if stackB is null and stackA is null, return null
		//
		// if stackB is null:
		//    while(items in StackA):
		//      pop from StackA
		//      push into StackB
		//
		// pop from StackB
		
		if (stackB.isEmpty()) {
			while (!stackA.isEmpty()){
				stackB.push( stackA.pop() );
			}
		}
		return stackB.pop();
	}
	
	void enqueue(Object obj){
		
		// if StackA is null and StackB is null, return null
		//
		// if StackA is null:
		//   while(items in StackB):
		//     pop from StackB
		//     push into StackA
		//
		// pop from StackA
		
		if (stackA.isEmpty()){
			while (!stackB.isEmpty()){
				stackA.push(stackB.pop());
			}
		}
		stackA.push(obj);
	}
}
