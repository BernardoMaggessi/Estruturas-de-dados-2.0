package pilhas;

public class Pilha {
	private int[] pilha;
	private int topo;
	private int capacidade;
	
	//Construtor
	public Pilha(int capacidade) {
		this.capacidade = capacidade;
		this.pilha = new int[capacidade];
		this.topo = -1;//A PILHA COMEÇA VAZIA
	}
	
	//VERIFICA SE A PILHA ESTÁ CHEIA
	public boolean isFull() {
		return topo == capacidade-1;
	}
	
	//VERIFICA SE A PILHA ESTÁ VAZIA
	public boolean isEmpty() {
		return topo == -1;
	}
	//INSERE ITEM NA PILHA
	public void push(int valor) {
		if(isFull()) {
			System.out.println("Pilha já se encontra cheia");
		}else {
			pilha[++topo] = valor;
			System.out.println("valor inserido na pilha");
		}
	}
	 // Remove o item do topo da pilha
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1; // Retorna um valor de erro
        } else {
            return pilha[topo--];
        }
    }

    // Verifica o item do topo sem removê-lo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1; // Retorna um valor de erro
        } else {
            return pilha[topo];
        }
    }

    // Retorna o tamanho da pilha
    public int size() {
        return topo + 1;
    }

    // Exibe os elementos da pilha
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5); // Cria uma pilha com capacidade 5
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.display(); // Exibe a pilha: 10 20 30

        System.out.println("Topo da pilha: " + pilha.peek());

        pilha.pop();
        pilha.display(); // Exibe a pilha: 10 20

        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}

