package trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree<T>{

	public TreeNode<T> root;
	
	BinaryTree(){this.root = null;}
	
	BinaryTree(TreeNode<T> node){
		this.root = node;
	}
	
	public boolean isEmpty(){
		return (this.root==null);
	}
	
	// is the tree balanced
	public boolean isBalanced(){
		// if max_height of tree - min_height of tree > 1, it is unbalanced
		return (maxHeightRec(this.root) - minHeightRec(this.root) <= 1);
	}
	public int minHeight(){
		return minHeightRec(this.root);
	}
	public int maxHeight(){
		return maxHeightRec(root);
	}
	private int maxHeightRec(TreeNode<T> node){
		if (node==null) return 0;
		else
			return 1 + Math.max( maxHeightRec(node.left), maxHeightRec(node.right) );
	}
	private int minHeightRec(TreeNode<T> node){
		if (node==null) return 0;
		else
			return 1 + Math.min( minHeightRec(node.left), minHeightRec(node.right));
	}
	
	// Depth first traversals
	public void printInOrder(){
		TreeUtils.printInOrderRecursive(root);
	}
	public void printPreOrder(){
		TreeUtils.printPreOrderRecursive(root);
	}
	public void printPostOrder(){
		TreeUtils.printPostOrderRecursive(root);
	}
	// Breadth first traversal
	public void printBreadthFirst(){
		TreeUtils.bfsTraversal(root);
	}
	
	// search for a node and return it
	public TreeNode<T> getNode(T data){
		if (this.root.data == data) return root;
		return findNode(this.root, data);
	}
	private TreeNode<T> findNode(TreeNode<T> node, T data){
		if (node.data == data) return node;
				
		TreeNode<T> n = null;
		if (node.left != null) 
			n = findNode(node.left, data);
		if (n == null && node.right!=null) 
			n = findNode(node.right, data);
		return n;
	}

	// return an array of linkedlists where every linkedlist has elements from one level
	public ArrayList<LinkedList<TreeNode>> makeLevelLinkedLists(){
		// create an array of linkedlists [every linkedlist in the array represents a level]
		// add root node to a list and put that list into the array
		
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> newList = new LinkedList<TreeNode>();
		newList.add(root);
		int level = 0;
		result.add(level, newList);
		
		// while there are more lists in the array
		while(true){
			System.out.println("\nfor level: " + level);
			// get list from array for this level
			// for all nodes in the list
				// if node has left child, add it to a new list
				// if node has right child, add it to the new list
			// add this list to the array on next element
			
			LinkedList<TreeNode> currentLevelList = result.get(level);
			int current_list_size = currentLevelList.size();
						
			if (current_list_size == 0) break;
			
			newList = new LinkedList<TreeNode>();

			System.out.print("Managing node: ");
			for (int i=0; i < current_list_size; i++){
				
				TreeNode node = currentLevelList.get(i);
				System.out.print(" " + node.data);
				
				if (node.left!=null) newList.add(node.left);
				if(node.right!=null) newList.add(node.right);

			}
			level++;
			result.add(level, newList);
		}	
		
		return result;
	}	

	// if t2 is a subtree of this tree
	public boolean isSubTree(BinaryTree t2){
		
		if (this.root == null) return false;
		if (t2.root == null) return true;
		
		boolean val = search(this.root, t2.root);
		return val;
	}
	private boolean search(TreeNode t1, TreeNode t2){
		if (t1==null) return false; // we have reached end of big tree
		System.out.println( String.format( "searching... t1: %c, t2: %c ", (Character) t1.data, (Character)t2.data) );
				
		if (t1.data == t2.data){
			System.out.println("jumping into match tree");
			// try to match the trees
			boolean val = matchTree(t1, t2);
			if (val) return val; // if match is succesful, return true
		}
		// If this node is not small tree's root OR if match tree was not successful 
		// search in left tree
		// search in right tree
		return search(t1.left, t2) || search(t1.right, t2);
	}
	private boolean matchTree(TreeNode t1, TreeNode t2){
		if (t1==null && t2==null) return true;
		if (t1==null && t2!=null) return false;
		if (t1!=null && t2==null) return true;
		
		System.out.println( String.format("    matching... t1: %c, t2: %c", (Character) t1.data, (Character)t2.data) );
		
		if (t1.data == t2.data){
			// match left sub trees
			// match right sub trees
			return ( matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right) );
		}
		else
			return false;
	}
	
	public TreeNode firstCommonAncestor(Object p, Object q){
		if (this.root == null) return null;
		if (p==null || q==null) return null;
		return firstCommonAncestorRec(this.root, new TreeNode(p), new TreeNode(q) );
	}	
	private TreeNode firstCommonAncestorRec(TreeNode root, TreeNode p, TreeNode q){
		// if p is in the left subtree of root AND q is in the left subtree of root, find firstCommonAncestor in left subtree
		// if p is in the right subtree AND q is in the right subtree, find firstCommonAncestor in right subtree
		// else return root (since this implies that p and q are in different subtrees)
		if ( existsNode(root.left, p) && existsNode(root.left, q) )
			return firstCommonAncestorRec(root.left, p, q);
		if (existsNode(root.right, p) && existsNode(root.right, q) )
			return firstCommonAncestorRec(root.right, p, q);
		
		return root;
	}	
	public boolean existsNode(TreeNode root, TreeNode node){
		if (root == null) return false;
		if (root.data == node.data) return true;
				
		return existsNode(root.left, node) || existsNode(root.right, node);
	}
}
