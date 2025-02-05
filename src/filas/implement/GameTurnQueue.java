package filas.implement;

import java.util.LinkedList;
import java.util.Queue;

public class GameTurnQueue {
    private Queue<Action> actionQueue;

    public GameTurnQueue() {
        actionQueue = new LinkedList<>();
    }

    // Enfileirar a ação
    public void enqueueAction(Action action) {
        actionQueue.add(action);
        System.out.println("Ação enfileirada: " + action);
    }

    // Processar todas as ações na fila
    public void processActions() {
        while (!actionQueue.isEmpty()) {
            Action action = actionQueue.poll();  // Remove a ação da frente da fila
            processAction(action);
        }
    }

    // Processa uma ação
    private void processAction(Action action) {
        // Aqui você pode implementar a lógica do que acontece para cada tipo de ação
        switch (action.getActionType()) {
            case "attack":
                System.out.println(action + " - Ataque executado!");
                break;
            case "move":
                System.out.println(action + " - Movimento realizado!");
                break;
            case "defend":
                System.out.println(action + " - Defesa ativada!");
                break;
            default:
                System.out.println(action + " - Ação desconhecida!");
        }
    }

    public boolean isQueueEmpty() {
        return actionQueue.isEmpty();
    }
}
