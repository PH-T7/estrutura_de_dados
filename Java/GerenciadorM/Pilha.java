package GerenciadorM;

import java.util.Stack;

// Classe Pilha para tarefas prioritárias
class Pilha {
    private Stack<TarefaPrioritaria> pilha = new Stack<>();

    public void adicionar(TarefaPrioritaria tarefa) {
        pilha.push(tarefa);
    }

    public TarefaPrioritaria remover() {
        return pilha.pop();
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }

    public void listar() {
        for (TarefaPrioritaria t : pilha) {
            System.out.println(t);
        }
    }
}
