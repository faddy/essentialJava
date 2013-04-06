package stacksAndQueues;

/*
 * This object has the capability to store a 'min' value 
 * along with the data value.
 * The min value stores the minimum value in the nodes
 * in the stack below this node.
 * */
public class StackMinNode {

	int data;
	int min;
	StackMinNode next;
	
	StackMinNode(int data, int min){
		this.data = data;
		this.min = min;
	}
}
