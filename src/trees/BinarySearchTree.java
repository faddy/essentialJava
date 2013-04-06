package trees;

public class BinarySearchTree extends BinaryTree<Number> {

	public BinarySearchTree(){
		super();
	}
	
	// insert a node in the tree
	public void insert(Number n){
		if (this.root == null)
			this.root = new TreeNode<Number>(n);
		else 
			insertAtNode(this.root, n);
	}	
	private void insertAtNode(TreeNode<Number> p, Number n){
		
		if ( n.longValue() < p.data.longValue() ) {
			// put in left sub tree
			if (p.left == null) p.left = new TreeNode<Number>(n);
			else insertAtNode(p.left, n);
		}
		else {
			// put in right sub tree
			if (p.right==null) p.right = new TreeNode<Number>(n);
			else insertAtNode(p.right, n);
		}
	}
	
	// creates a balanced BST from a given sorted array
	public void createFromSortedArray(Number[] array){
		
		if (array.length == 0) return;
		if (array.length == 1) {
			this.insert(array[0]);
			return;
		}
		
		int beg = 0;
		int end = array.length - 1;
		
		this.root = createBSTFromSortedArray(array, beg, end);
	}
	
	private TreeNode<Number> createBSTFromSortedArray(Number[] arr, int beg, int end){
		
		if (end < beg) return null;
		
		int mid = (beg + end)/2;
		TreeNode<Number> n = new TreeNode<Number>(arr[mid]);
		n.left = createBSTFromSortedArray(arr, beg, mid-1);
		n.right = createBSTFromSortedArray(arr, mid+1, end);
		
		return n;
		
	}
}
