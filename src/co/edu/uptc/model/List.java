package co.edu.uptc.model;

public class List {
	private Node nodeHead;

	public List() {
		nodeHead = null;
	}

	public void addBefore(Node node) {
		// usando temporal. While
	}

	public void addAfter(Node node) {
// aqu� hay que recorrer toda la lista, encontrar el final y a�adirlo. 
	}

	private void removeIndex(int index) {
		// Se recorre toda la lista con un contador por ciclo y dentro un condicional.
		//se asigna el apuntador. 
		//java, trash.
		int cont = 0;
		Node temp = nodeHead;
		while (cont < index) {
			temp = temp.getNext();
			cont++;

		}

	}

	private void removeRepeat() {
//		se recorre la lista 

	}
}
