package trees;
import stacksAndQueues.Stack;
import stacksAndQueues.Queue;

public class TreeUtils {

	public static void printInOrderRecursive(TreeNode node){
		if (node==null) return;
		
		printInOrderRecursive(node.left);
		System.out.print(node.data + ", ");
		printInOrderRecursive(node.right);
	}
	
	public static void printPreOrderRecursive(TreeNode node){
		if (node==null) return;
		
		System.out.print(node.data + ", ");
		printPreOrderRecursive(node.left);
		printPreOrderRecursive(node.right);
	}
	
	public static void printPostOrderRecursive(TreeNode node){
		if (node==null) return;
		
		printPostOrderRecursive(node.left);
		printPostOrderRecursive(node.right);
		System.out.print(node.data + ", ");
	}
	
	/*Test this function.. looks fishy*/
	public static void printInOrderIterative(TreeNode node){
		Stack st = new Stack();
		while( node!=null || !st.isEmpty() ){
			
			if (node != null){
				st.push(node);
				node = node.left;
			}
			else {
				node = (TreeNode) st.pop();
				System.out.print(node.data + ", ");
				node = node.right;
			}
			
		}		
	}
	
	public static void bfsTraversal(TreeNode node){
		Queue q = new Queue();
		if (node==null) return;
		q.enqueue(node);
		while ( !q.isEmpty() ){
			node = (TreeNode) q.dequeue();
			System.out.print(node.data + ", ");
			if (node.left!=null) q.enqueue(node.left);
			if (node.right!=null) q.enqueue(node.right);
		}
	}
	
	public TreeNode createTreeFromArray(Object[] arr){
		return null;
	}

}
