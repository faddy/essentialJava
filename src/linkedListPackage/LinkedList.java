package linkedListPackage;

public class LinkedList {

	public LinkedListNode head;
	public LinkedListNode tail;	// not implementing these at the moment
	public int length;
	
	public LinkedList(){
		this.head = null;
	}
	
	public void add(LinkedListNode node){
		if (head == null) head = node;
		else {
			LinkedListNode tail = head;
			while (tail.next!=null) tail = tail.next;
			tail.next = node;
		}
	}
	
	public void deleteOne(int data){
		
		if (head == null) return;
		
		if (head.data == data) {
			head = head.next;
		}
		else {
			LinkedListNode ptr = head;
			while(ptr!=null){
				if (ptr.next.data == data) {
					ptr.next = ptr.next.next;
					return;
				}
				else ptr = ptr.next;
			}
		}
		
	}
	
	public void deleteAll(int data){
		if (head == null) return;
		
		while (head.data == data){
			head = head.next;
			if (head == null) return;
		}
		
		LinkedListNode ptr = head;
		while(ptr.next != null){
			if (ptr.next.data == data){
				ptr.next = ptr.next.next;
			}
			else ptr = ptr.next;
		}
			
	}
	
	public void printList(){
		if (head == null) System.out.println("null");
		else {
			LinkedListNode ptr = head;
			while (ptr != null){
				System.out.print(ptr.data + ", ");
				ptr = ptr.next;
			}
			System.out.println();
		}
	}
	
	public void removeDuplicates(){
		if (head == null) return;		// if the list has no elements
		if (head.next == null) return;	// if the list has only one element
		
		LinkedListNode current = head;
		while(current!=null){
			LinkedListNode ptr = current;
			while (ptr.next != null){
				if (ptr.next.data == current.data){
					ptr.next = ptr.next.next;
				}
				else ptr=ptr.next;
			}
			current = current.next;
		}
		
	}
	
	public LinkedListNode findNthFromLast(int n){
		if (n==0) return null;
		
		LinkedListNode end = head;
		for (int i=0; i<n; i++){
			if (end == null) {
				System.out.println("n is > length of list");
				return null;				
			}
			else {
				end = end.next;
			}
		}

		LinkedListNode res = head;
		while (end != null){
			end = end.next;
			res = res.next;
		}
		return res;
	}
}
