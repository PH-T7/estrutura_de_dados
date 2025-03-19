package GerenciadorM;

import java.util.Comparator;
import java.util.PriorityQueue;

// Classe FilaPrioridade para tarefas com prioridade numérica
class FilaPrioridade {
    private PriorityQueue<TarefaPrioridadeNumerica> fila =
            new PriorityQueue<>(Comparator.comparingInt(TarefaPrioridadeNumerica::getPrioridade));

    public void adicionar(TarefaPrioridadeNumerica tarefa) {
        fila.add(tarefa);
    }

    public TarefaPrioridadeNumerica remover() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void listar() {
        for (TarefaPrioridadeNumerica t : fila) {
            System.out.println(t);
        }
    }
}