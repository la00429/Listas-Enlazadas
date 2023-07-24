package co.edu.uptc.presenter;

import co.edu.uptc.model.Node;

public class Presenter {

	public static void main(String[] args) {
		Node first = new Node("Example");
		Node second = new Node(19);
		Node third  = new Node("Hi");
		
		first.linkNext(second);
		first.getNext().linkNext(third);
		
		System.out.println(first.getNext().getValue().toString());
	}
}
