package listas;

public class Node {// o nó guarda sua informação e uma referencia a um próximo objeto, no caso de uma linkedList simples
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;//o próximo nó começa com null
	}

}
