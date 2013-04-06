package stacksAndQueues;

public class Queue {

	public Node first, last;
	
	public void enqueue(Object item){
		if (first==null){
			first = new Node(item);
			last = first;
		}
		else {
			last.next = new Node(item);
			last = last.next;
		}
	}
	
	public Object dequeue() { //throws CollectionEmptyException {
		if (first==null) return null; //throw new CollectionEmptyException();
		
		Object item = first.data;
		
		if (first==last) {
			first = null;
			last = null;
		}
		else {
			first = first.next;
		}
		return item;
	}
	
	public String toString(){
		Node ptr = first;
		StringBuilder str = new StringBuilder();
		while(ptr!=null){
			Object item = ptr.data;
			str.append( item.toString() );
			if (ptr.next != null)	str.append(", ");
			ptr = ptr.next;
		}
		return str.toString();
	}
	
	public boolean isEmpty(){
		if (first != null) return false;
		else return true;
	}
}
