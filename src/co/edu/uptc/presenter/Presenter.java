package co.edu.uptc.presenter;

import co.edu.uptc.model.Node;

public class Presenter implements Contract.Presenter{
	private Contract.Model model;
	private Contract.View view;

	public static void main(String[] args) {
		Node first = new Node("Example");
		Node second = new Node(19);
		Node third  = new Node("Hi");
		
		first.linkNext(second);
		first.getNext().linkNext(third);
		
		System.out.println(first.getNext().getValue().toString());
	}

	@Override
	public void setModel(Contract.Model model) {
		this.model = model;
	}

	@Override
	public void setView(Contract.View view) {
		this.view = view;
	}

	@Override
	public void run() {
		System.out.println("Hello world!");
	}
}
