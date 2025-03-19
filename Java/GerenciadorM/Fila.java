package GerenciadorM;

import java.util.LinkedList;
import java.util.Queue;

class Fila {
    private Queue<TarefaRegular> fila = new LinkedList<>();

    public void adicionar(TarefaRegular tarefa) {
        fila.add(tarefa);
    }

    public TarefaRegular remover() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void listar() {
        for (TarefaRegular t : fila) {
            System.out.println(t);
        }
    }
}