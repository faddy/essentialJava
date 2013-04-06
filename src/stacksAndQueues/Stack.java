package stacksAndQueues;

/*
 * A simple lifo Stack implementation
 * */
public class Stack {
	public Node top;
	
	public Object pop() { //throws CollectionEmptyException {
		if (top==null) return null; //throw new CollectionEmptyException();
		Node temp = top;
		top = top.next;
		return temp.data;
	}
	
	public void push(Object item){
		if (top==null) {
			top = new Node(item);
		}
		else {
			Node newNode = new Node(item);
			newNode.next = top;
			top = newNode;
		}
	}
	
	public String toString(){
		Node ptr = top;
		StringBuilder str = new StringBuilder();
		while(ptr!=null) {
			str.append( ptr.data.toString() );
			if (ptr.next != null) str.append(", ");
			ptr = ptr.next;
		}
		return str.toString();
	}
	
	public boolean isEmpty(){
		if (this.top == null) return true;
		else return false;
	}
	
	public Object peek(){
		return top.data;
	}
}
