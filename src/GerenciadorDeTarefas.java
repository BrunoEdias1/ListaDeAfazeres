package javaMain;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    public static ArrayList<Tarefa> tarefasstatus = new ArrayList<Tarefa>();

    public void removerTarefa(int opc) {
        if (opc > 0 && opc <= tarefasstatus.size()) {
            tarefasstatus.remove(opc - 1);
        }
    }

    public void adicionarTarefa(int id, String desc, boolean status) {
        Tarefa addTarefa = new Tarefa(id, desc, status);
        tarefasstatus.add(addTarefa);
    }

    public void marcarStatus(int index, int opc) {
        if (index >= 0 && index < tarefasstatus.size()) {
            Tarefa tarefa = tarefasstatus.get(index);
            if (opc == 1) {
                tarefa.setStatus(true);
            } else if (opc == 2) {
                tarefa.setStatus(false);
            }
        }
    }

public String listarTarefas() {
    if (tarefasstatus.isEmpty()) {
        return "Nenhuma tarefa cadastrada.";
    }
    
    StringBuilder lista = new StringBuilder();
    for (Tarefa tarefa : tarefasstatus) {
        lista.append(tarefa.toString()).append("\n");
    }
    return lista.toString();
}
}