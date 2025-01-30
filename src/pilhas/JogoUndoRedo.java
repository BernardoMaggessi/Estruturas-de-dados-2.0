package pilhas;

import java.util.Stack;

/*Este é um exemplo simples de como a pilha pode ser utilizada
 *para gerenciar ações de um jogo
 *com funcionalidades de undo/redo*/
public class JogoUndoRedo {
	private Stack<String> undoStack;
	private Stack<String> redoStack;
	
	public JogoUndoRedo() {
		undoStack = new Stack<>();
		redoStack = new Stack<>();
	}
	//Realiza uma ação e coloca na pilha do undo
	public void realizarAcao(String ação) {
		undoStack.push(ação);
		redoStack.clear();//LIMPA STACK DE REDO APÓS NOVA AÇÃO
	}
	public void desfazer() {
		if(!undoStack.isEmpty()) {
			String acaoDesfeita = undoStack.pop();
			redoStack.push(acaoDesfeita);
			System.out.println("Ação desfeita: "+acaoDesfeita);
		}else {
			System.out.println("Não há ações para desfazer");
		}
	}
	//REFAZ ÚLTIMA AÇÃO FEITA
	public void refazer() {
		if(!redoStack.isEmpty()) {
			String acaoRefeita = redoStack.pop();
			undoStack.push(acaoRefeita);
			System.out.println("Ação refeita: "+acaoRefeita);
		}else {
			System.out.println("Não há ação para refazer");	
		}
	}
	  public static void main(String[] args) {
	        JogoUndoRedo jogo = new JogoUndoRedo();

	        // Realizando ações
	        jogo.realizarAcao("Mover personagem para a direita");
	        jogo.realizarAcao("Pular obstáculo");
	        jogo.realizarAcao("Atacar inimigo");

	        // Desfazendo e refazendo ações
	        jogo.desfazer(); // Desfaz a ação "Atacar inimigo"
	        jogo.refazer(); // Refaz a ação "Atacar inimigo"
	        jogo.desfazer(); // Desfaz a ação "Pular obstáculo"
	        jogo.desfazer(); // Desfaz a ação "Mover personagem para a direita"
	        jogo.desfazer(); // Não há ações para desfazer
	    }
	}