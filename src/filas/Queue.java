package filas;


public class Queue<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public Queue() {
		this.front = this.rear = null;	
		this.size = 0;
	}
	public boolean isEmpty() {
		return front == null;
	}
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if(rear == null) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear =newNode;
		}
		size++;
	}
	public T dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("A fila está vazia");
		}
		T data = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		size --;
		return data;
	}
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("A fila está vazia");
		}
		return front.data;
	}
	public int size() {
		return size;
	}
	public void printQueue() {
		Node<T> temp = front;
		System.out.print("Fila:");
		while (temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}System.out.println("Null");
	}
	public static void main(String[] args) {
		Queue<String> fila = new Queue<String>();
		
		System.out.println("Adicionando objetos na fila");
		fila.enqueue("Bernardo");
		fila.enqueue("Mateus");
		fila.enqueue("Rafael");
		System.out.println();
		
		System.out.println("Tamanho da fila -> "+fila.size());
		fila.printQueue();
		System.out.println();
		fila.dequeue();
		
		System.out.println("Primeiro da fila irá ser retirado");
		fila.printQueue();
		
		System.out.println("Primeiro elemento da fila -> "+fila.peek());
		
	}
}
