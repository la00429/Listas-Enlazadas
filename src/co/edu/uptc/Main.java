package co.edu.uptc;

import co.edu.uptc.presenter.ManagerGeneral;

public class Main {
    public static void main(String[] args) {
        ManagerGeneral managerGeneral = new ManagerGeneral();
        managerGeneral.run();
    }

    //public static void main(String[] args) {
    //		Node first = new Node("Example");
    //		Node second = new Node(19);
    //		Node third  = new Node("Hi");
    //
    //		first.linkNext(second);
    //		first.getNext().linkNext(third);
    //
    //		System.out.println(first.getNext().getValue().toString());
    //	}
}
