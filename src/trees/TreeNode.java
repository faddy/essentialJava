package trees;

public class TreeNode<T>  {

	T data;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode(){}
	
	public TreeNode(T data){
		this.data = data;
	}
}
