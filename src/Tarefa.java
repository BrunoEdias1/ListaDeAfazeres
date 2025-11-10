package javaMain;

import java.util.ArrayList;

public class Tarefa {
	public ArrayList<Tarefa> tarefasstatus = new ArrayList<Tarefa>();


	private int id; // ID da tarefa
	private String descricao; // Descrição da Tarefa
	private boolean status;  // Status da Tarefa


	public Tarefa(int id, String descricao, boolean status) {
		this.id = id;
		this.descricao = descricao;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
	    this.status = status;
	}
	

	
	
	public void marcarStatus(int status) {
		switch (status) {
		case 1:
			setStatus(true);
			break;
			
		case 2:
			setStatus(false);
			break;
			
		default:
			System.out.println("Opção invalida");
			break;
		}

	}

@Override
public String toString() {
    return "\nNúmero da Tarefa: " + id + 
           "\nDescrição: " + descricao + 
           "\nStatus: " + (status ? "Concluída" : "Pendente") + "\n";
}


}
