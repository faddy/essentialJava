package linkedListPackage;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//LinkedList<Integer> objList = new LinkedList<Integer>();
		LinkedList l = new LinkedList();
		
		l.add(new LinkedListNode(2));
		l.add(new LinkedListNode(1));
		l.add(new LinkedListNode(10));
//		l.add(new LinkedListNode(2));
		l.add(new LinkedListNode(31));
		l.add(new LinkedListNode(31));
//		l.add(new LinkedListNode(2));
		l.add(new LinkedListNode(56));
//		l.add(new LinkedListNode(2));
		l.printList();
		
		l.removeDuplicates();
		l.printList();
		LinkedListNode nthFromLast = l.findNthFromLast(0);
		
		System.out.println( (nthFromLast != null)? nthFromLast.data : null);

	}
	
}
