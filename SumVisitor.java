
public class SumVisitor implements IVisitable {
	private int sum;


	public double getSum() {
		return sum;
	}
	public void postOderTraverse(Node root) {
		if(root == null) return;
		postOderTraverse(root.left);
		postOderTraverse(root.right);
		sum += root.value;
	}
	@Override
	public int accept(BinaryTree data) {
		postOderTraverse(data.root);
		return sum;
	}
	
}
