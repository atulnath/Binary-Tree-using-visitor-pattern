
public class Node implements IVisitor{
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
		left = right = null;
	}
    
    public int getValue()
    {
        return value;    
    }

	@Override
	public void visit(int val) {
		System.out.print(val+"->");
	}
}
