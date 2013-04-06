package trees;
import java.util.*;

public class Tests {

	public static void main(String[] args){
		
		testBinaryTree();
	}
	
	public static void testBinarySearchTree(){
		BinarySearchTree bst = new BinarySearchTree();
//		bst.insert(5);
//		bst.insert(6);
//		bst.insert(2.5);
//		bst.insert(1);
//		bst.insert(3);
		Number[] array = {1,2,5,6,7,8,9,10,34,73};
		bst.createFromSortedArray(array);
		bst.printInOrder();
		
		System.out.println();
		System.out.println("Min height: " + bst.minHeight());
		System.out.println("Max height: " + bst.maxHeight());
		System.out.println( bst.isBalanced() );
		
		System.out.println();
		printArrayList( bst.makeLevelLinkedLists() );
		
	}
	
	public static void testBinaryTree(){
		
		BinaryTree<Character> bt = new BinaryTree(); //createTestTree();
		bt.printInOrder();
		System.out.println();
		printArrayList( bt.makeLevelLinkedLists() );
		TreeNode ancestor = bt.firstCommonAncestor('e', null);
		System.out.println(ancestor.data);

	}
	
	public static BinaryTree<Character> createTestTree(){
		TreeNode<Character> root = new TreeNode<Character>('a');
		TreeNode<Character> node = root;
		
		node.left = new TreeNode<Character>('b');
		node.right = new TreeNode<Character>('g');
	
		node = node.left;
		node.left = new TreeNode<Character>('c');
		node.right = new TreeNode<Character>('d');

		node.right.left = new TreeNode<Character>('e');
		node.right.right = new TreeNode<Character>('f');
		
		node=root;
		node.right = new TreeNode<Character>('g');
		node.right.right = new TreeNode<Character>('h');
		
		return new BinaryTree<Character>(root);
	}
	
	public static BinaryTree<Character> createSmallTestTree(){
		TreeNode<Character> root = new TreeNode<Character>('b');
		TreeNode<Character> node = root;
		
		node.left = new TreeNode<Character>('a');
//		node.right = new TreeNode<Character>('g');
	
//		node = node.left;
//		node.left = new TreeNode<Character>('c');
//		node.right = new TreeNode<Character>('d');
//
//		node.right.left = new TreeNode<Character>('e');
//		node.right.right = new TreeNode<Character>('f');
//		
//		node=root;
//		node.right = new TreeNode<Character>('g');
//		node.right.right = new TreeNode<Character>('h');
		
		return new BinaryTree<Character>(root);
	}
	
	public static void printArrayList(ArrayList<LinkedList<TreeNode>> result){
		for (LinkedList list : result){
			Object[] arr = list.toArray();
			for (Object node : arr) System.out.print( ( (TreeNode) node).data + " " );
			System.out.println();
		}
	}
}