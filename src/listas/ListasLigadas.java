package listas;

public class ListasLigadas {
	private Node head;//primeiro nó na lista	
	
	public void insert(int data) {
		//inserir um novo nó no final da lista
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;//Se a lista estiver vazia define com o Head
			return;
		}
		Node temp = head;
		while(temp.next!=null)
			temp = temp.next;//percorre até o último nó
		
		temp.next = newNode;
	}
	public void delete(int data) {
		if(head == null) return;
		
		if(head.data == data) {
			head = head.next;//se for o primeiro nó move o head
			return;
		}
		Node temp = head;
		while(temp.next!=null && temp.next.data != data) {
			temp = temp.next;
		}
		if(temp.next!=null) 
			temp.next = temp.next.next;
		
	}
	//Exibit a lista
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ListasLigadas lista = new ListasLigadas();
		
		lista.insert(10);
		lista.insert(20);
		lista.insert(30);
		lista.insert(40);
		lista.insert(50);
		
		System.out.println("lista após inserções");
		lista.display();
		
		lista.delete(20);
		lista.delete(30);
		System.out.println("lista após deleções");
		lista.display();
	}
}
