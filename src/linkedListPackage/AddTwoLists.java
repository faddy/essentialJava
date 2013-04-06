package linkedListPackage;
import java.util.Arrays;

public class AddTwoLists {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(new LinkedListNode(2));
		l1.add(new LinkedListNode(9));
		l1.add(new LinkedListNode(6));
		l1.add(new LinkedListNode(9));
		
		l2.add(new LinkedListNode(4));
		l2.add(new LinkedListNode(5));
		l2.add(new LinkedListNode(6)); //7));
		
		l1.printList(); l2.printList(); System.out.println();
		LinkedList l3 = addListsRecursively(l1, l2);
		System.out.println(); l3.printList();
	}
	
	public static LinkedListNode addTwoLists(
			LinkedListNode l1,
			LinkedListNode l2,
			int carry){
		
		if (l1 == null && l2 == null) return null;
		
		int value = 0;
		if (l1 == null) {
			value += l2.data;
		}
		else if (l2 == null){
			value += l1.data;
		}
		else {
			value = l1.data + l2.data + carry;
			if (value > 9) {
				carry = 1;
				value = value % 10;
			}
		}
		System.out.println(value + ", " + carry);
		LinkedListNode res = new LinkedListNode(value);
		res.next = addTwoLists(l1.next, l2.next, carry);
		return res;
	}

	public static LinkedList addListsRecursively(
			LinkedList ll1,
			LinkedList ll2){
		
		LinkedListNode l1 = ll1.head;
		LinkedListNode l2 = ll2.head;
		
		LLobj obj = addLists(l1, l2, 0, 0);
		
		LinkedListNode resNode = obj.node;
		if (obj.carry == 1){
			// add another node at the end of the list
			LinkedListNode p = resNode;
			while (p.next != null) p = p.next;
			p.next = new LinkedListNode(1);
		}
		LinkedList resList = new LinkedList();
		resList.head = resNode;
		return resList;
	}
	
	public static LLobj addLists( LinkedListNode l1,
									LinkedListNode l2,
									int carry,
									int count){
		count++;
		
		char[] ar = new char[count];
		Arrays.fill(ar, '*');
		String str = new String(ar);
				
		if (l1==null && l2==null) return new LLobj( null, carry );
		
		int val = carry;
		
		if (l1==null) val += l2.data;
		if (l2==null) val += l1.data;
		else val += (l1.data + l2.data);
		
		carry = (val >= 10)? 1 : 0;
		val = val % 10;
		System.out.println(str + "val: " + val + ", carry:" + carry);
		LLobj obj = new LLobj(new LinkedListNode(val), carry);
		
		LLobj more = addLists(  (l1==null)? null:l1.next, 
								(l2==null)? null:l2.next, 
								carry, count);
		obj.node.next = more.node;
		
		System.out.println(str + "val: " + obj.node.data + ", carry: " + obj.carry);
		return obj;
	}
}
