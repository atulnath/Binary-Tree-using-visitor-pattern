
public class TreePrinter implements IVisitable{

	@Override
	public int accept(BinaryTree tree) {
		// TODO Auto-generated method stub
		System.out.print("Total traverse is: " );
		postOderTraverse(tree.root);
		System.out.println();
		return tree.root.value;
	}
	public void postOderTraverse(Node root) {
		if(root == null) return;
		postOderTraverse(root.left);
		postOderTraverse(root.right);
		root.visit(root.value);
	}
}
