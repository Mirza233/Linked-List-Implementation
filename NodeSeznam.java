package psa.naloga1;

public class NodeSeznam {
	private static int counter;
	public NodeSeznam tail;
	public int key;

	
	public int compare(NodeSeznam node) {
		counter++;
		return node.key - this.key;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void resetCounter() {
		counter=0;
	}
}
