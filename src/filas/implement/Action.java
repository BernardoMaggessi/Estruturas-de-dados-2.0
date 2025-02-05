package filas.implement;

//CLASS ACTION REPRESENTA AÇÃO DE JOGADOR -- na classe main usaremos faremos filas de ação// aplicação real de filas numa realidade para jogos
public class Action {
    private String playerName;
    private String actionType;  // Ex: "attack", "move", "defend"
    private int target;         // Um número representando o alvo (para simplificação)

    public Action(String playerName, String actionType, int target) {
        this.playerName = playerName;
        this.actionType = actionType;
        this.target = target;
    }

    // Getters e Setters
    public String getPlayerName() {
        return playerName;
    }

    public String getActionType() {
        return actionType;
    }

    public int getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return playerName + " faz a ação: " + actionType + " no alvo " + target;
    }
}
