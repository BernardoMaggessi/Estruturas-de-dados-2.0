package filas;
//Fila que representa um nó, elemento na fila
public class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}
