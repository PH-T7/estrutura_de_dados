package GerenciadorM;

// Tarefa Prioritária (LIFO)
class TarefaPrioritaria extends Tarefa {
    public TarefaPrioritaria(String descricao) {
        super(descricao);
    }

    @Override
    public String toString() {
        return "Prioritária: " + descricao + " (Criada em: " + dataCriacao + ")";
    }
}
