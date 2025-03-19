package GerenciadorM;

import java.time.LocalDateTime;

// Classe base para todas as tarefas
abstract class Tarefa {
    protected String descricao;
    protected LocalDateTime dataCriacao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}