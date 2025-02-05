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
	public boolean PilhaCheia() {
		return topo == capacidade-1;
	}
	
	//VERIFICA SE A PILHA ESTÁ VAZIA
	public boolean PilhaVazia() {
		return topo == -1;
	}
	//INSERE ITEM NA PILHA
	public void Empilhar(int valor) {
		if(PilhaCheia()) {
			System.out.println("Pilha já se encontra cheia");
		}else {
			pilha[++topo] = valor;
			System.out.println("valor inserido na pilha");
		}
	}
	 // Remove o item do topo da pilha
    public int Desempilhar() {
        if (PilhaVazia()) {
            System.out.println("Pilha vazia!");
            return -1; // Retorna um valor de erro
        } else {
            return pilha[topo--];
        }
    }

    // Verifica o item do topo sem removê-lo
    public int ElementoTopo() {
    	if (PilhaVazia()) {
            System.out.println("Pilha vazia!");
            return -1; // Retorna um valor de erro
        } else {
            return pilha[topo];
        }
    }

    // Retorna o tamanho da pilha
    public int Tamanho() {
        return topo + 1;
    }

    // Exibe os elementos da pilha
    public void Mostrar() {
    	if (PilhaVazia()) {
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
        
        pilha.ElementoTopo();
        pilha.Empilhar(5);
        pilha.Empilhar(8);
        pilha.Empilhar(4);
        pilha.Empilhar(7);
        pilha.Mostrar();
        pilha.Desempilhar();
        pilha.Desempilhar();
        pilha.ElementoTopo();
        pilha.Desempilhar();
        pilha.Desempilhar();
    }
}

