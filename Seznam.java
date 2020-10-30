package psa.naloga1;

public class Seznam {
	public NodeSeznam head;


	/*
	 * Metoda sprejme celo stevilo in ga vstavi v seznam. Ce element ze obstaja v seznamu, vrne false
	 * Metoda vrne true, ce je bil element uspesno vstavljen in false sicer.
	 */
	public boolean insertNode(NodeSeznam element,NodeSeznam current) {
		if (current == null){
			head = element;
			return true;
		}
		if (current.compare(element) == 0){
			return false;
		}
		
		if (current.tail == null) {
			current.tail = element;
			return true;
		}
		return insertNode(element,current.tail);

	}
	public void print(NodeSeznam current) {
		if (current == null){
			System.out.println("DOONE!!!");
		}
		else {
		System.out.print(current.key);
		System.out.print(" ");
		print(current.tail);
		}
	}
	
	
	public boolean insert(int element) {
		//throw new UnsupportedOperationException("To funkcijo morate implementirati");
		NodeSeznam node = new NodeSeznam();
		node.key = element;
		node.tail = null;
		return insertNode(node,head);	
	}

	/*
	 * Metoda sprejme celo stevilo in izbrise element iz seznama. 
	 * Metoda vrne true, ce je bil element uspesno izbrisan iz seznama, in false sicer
	 */
	
	public boolean deleteNode(NodeSeznam element,NodeSeznam current) {
		if (current == null || current.tail == null) {
			if (current.compare(element)==0) {
				current = null;
				return true;
			}
			return false;
		}
		if (current.tail.compare(element) == 0) {
			current.tail = current.tail.tail;
			return true;
		}
		return deleteNode(element,current.tail);
		//return true;
	}
	
	public boolean delete(int element) {
		NodeSeznam node = new NodeSeznam();
		node.key = element;
		return deleteNode(node,head);
	}

	/*
	 * Metoda sprejme celo stevilo in poisce element v seznamu. 
	 * Metoda vrne true, ce je bil element uspesno najden v seznamu, in false sicer
	 */
	public boolean searchNode(NodeSeznam element,NodeSeznam current) {
		if (current == null){
			return false;
		}
		if (element.compare(current) == 0){
			return true;
		}
		return searchNode(element,current.tail);
	}
	
	public boolean search(int element) {
		NodeSeznam node = new NodeSeznam();
		node.key = element;
		return searchNode(node,head);
	}
	
	public int getCounter() {
		return head != null?head.getCounter():null;
	}
	
	public void resetCounter() {
		if(head!= null)
			head.resetCounter();
	}
}
