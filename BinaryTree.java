import java.util.Scanner;

public class BinaryTree{

	Scanner in = new Scanner(System.in);
	Node root;
	public BinaryTree(int value) {
		root = new Node(value);
	}
	public void operation() {
		SumVisitor sum = new SumVisitor();
		TreeLeafSum tls = new TreeLeafSum();
		TreePrinter tp = new TreePrinter();
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;	
		System.out.println("The root of the binary tree is: "+tp.accept(this));
		System.out.println("The sum of the binary tree is: "+sum.accept(this));
		System.out.println("The leaf sum of the binary tree is: "+tls.accept(this));
	}
}
