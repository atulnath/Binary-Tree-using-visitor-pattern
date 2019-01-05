
public class TreeLeafSum implements IVisitable {
	private int count;

	TreeLeafSum() {
		count = 0;
	}

	public int getCount() {
		return count;
	}

	@Override
	public int accept(BinaryTree tree) {
		postOderTraverse(tree.root);
		return count;
	}
	
	public void postOderTraverse(Node root) {
		if(root == null) return;
		postOderTraverse(root.left);
		postOderTraverse(root.right);
		if(root != null && root.left == null && root.right == null) {
			count += root.value;
		}
	}
}
