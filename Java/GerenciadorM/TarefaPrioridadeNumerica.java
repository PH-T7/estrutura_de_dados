package GerenciadorM;

// Tarefa com Prioridade Numérica
class TarefaPrioridadeNumerica extends Tarefa {
    private int prioridade;

    public TarefaPrioridadeNumerica(String descricao, int prioridade) {
        super(descricao);
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Prioridade Numérica (" + prioridade + "): " + descricao +
                " (Criada em: " + dataCriacao + ")";
    }
}