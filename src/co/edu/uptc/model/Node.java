package co.edu.uptc.model;

public class Node {
	Object value;
	Node next;
	
	public Node(Object value) {
		 this.value=value;
		 this.next= null;
	}
	
	public Object getValue() {
		return value;
	}
	
	//Aquí se apunta a otro nodo
	public void linkNext(Node node) {
		next=node;
	}

	public Node getNext() {
		return next;
	}
}
