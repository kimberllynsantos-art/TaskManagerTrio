import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private final List<Tarefa> tarefas = new ArrayList<>();

    // Adicionar tarefa
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    // Listar tarefas
    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas);
    }

    // Remover tarefa pelo índice
    public boolean removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            return true;
        }
        return false;
    }
}
