package GerenciadorM;

import java.time.LocalDateTime;
import java.util.*;

// Classe principal do gerenciador
class GerenciadorTarefas {
    private Pilha tarefasPrioritarias;
    private FilaPrioridade tarefasPrioridadeNumerica;
    private Fila tarefasRegulares;

    public GerenciadorTarefas() {
        tarefasPrioritarias = new Pilha();
        tarefasPrioridadeNumerica = new FilaPrioridade();
        tarefasRegulares = new Fila();
    }

    public void adicionarTarefaRegular(String descricao) {
        tarefasRegulares.adicionar(new TarefaRegular(descricao));
    }

    public void adicionarTarefaPrioritaria(String descricao) {
        tarefasPrioritarias.adicionar(new TarefaPrioritaria(descricao));
    }

    public void adicionarTarefaPrioridadeNumerica(String descricao, int prioridade) {
        tarefasPrioridadeNumerica.adicionar(new TarefaPrioridadeNumerica(descricao, prioridade));
    }

    public Tarefa processarProximaTarefa() {
        try {
            if (!tarefasPrioritarias.estaVazia()) {
                return tarefasPrioritarias.remover();
            } else if (!tarefasPrioridadeNumerica.estaVazia()) {
                return tarefasPrioridadeNumerica.remover();
            } else if (!tarefasRegulares.estaVazia()) {
                return tarefasRegulares.remover();
            }
        } catch (Exception e) {
            System.err.println("Erro ao processar a próxima tarefa: " + e.getMessage());
        }
        return null;
    }
    public void exibirTarefasPendentes() {
        System.out.println("=== Tarefas Prioritárias ===");
        tarefasPrioritarias.listar();
        System.out.println("\n=== Tarefas com Prioridade Numérica ===");
        tarefasPrioridadeNumerica.listar();
        System.out.println("\n=== Tarefas Regulares ===");
        tarefasRegulares.listar();
    }


    // Main para testes
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adicionando 6 tarefas (2 de cada tipo)
        gerenciador.adicionarTarefaRegular("Fazer relatório");
        gerenciador.adicionarTarefaRegular("Enviar e-mail");
        gerenciador.adicionarTarefaPrioritaria("Reunião urgente");
        gerenciador.adicionarTarefaPrioritaria("Chamada de emergência");
        gerenciador.adicionarTarefaPrioridadeNumerica("Revisar código", 2);
        gerenciador.adicionarTarefaPrioridadeNumerica("Testar sistema", 1);

        System.out.println("Tarefas iniciais:");
        gerenciador.exibirTarefasPendentes();

        // Removendo 3 tarefas
        System.out.println("\nProcessando 3 tarefas:");
        for (int i = 0; i < 3; i++) {
            Tarefa t = gerenciador.processarProximaTarefa();
            if (t != null) {
                System.out.println("Processada: " + t);
            }
        }

        // Listando tarefas pendentes
        System.out.println("\nTarefas pendentes:");
        gerenciador.exibirTarefasPendentes();
    }
}
