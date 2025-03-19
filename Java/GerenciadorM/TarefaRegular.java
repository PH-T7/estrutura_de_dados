package GerenciadorM;

// Tarefa Regular (FIFO)
class TarefaRegular extends Tarefa {
    public TarefaRegular(String descricao) {
        super(descricao);
    }

    @Override
    public String toString() {
        return "Regular: " + descricao + " (Criada em: " + dataCriacao + ")";
    }
}