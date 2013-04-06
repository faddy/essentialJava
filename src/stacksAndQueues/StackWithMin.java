package stacksAndQueues;

public class StackWithMin {

	StackMinNode top;
	
	public void push(int data){
		if (top==null){
			top = new StackMinNode(data, Integer.MAX_VALUE);
		}
		else {
			int min = Math.min( top.min, data );
			StackMinNode node = new StackMinNode(data, min);
			node.next = top;
			top = node;
		}
	}
	
	public int pop() throws Exception {
		if (top==null) throw new Exception("stack is empty");
		else {
			int val = top.data;
			top = top.next;
			return val;
		}
	}
	
	public int min() throws Exception {
		if (top==null) throw new Exception("stack is empty");
		else return top.min;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		StackMinNode node = top;
		while (node != null){
			str.append( node.data );
			str.append(", ");
			node = node.next;
		}
		return str.toString();
	}
}
