package javaMain;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		GerenciadorDeTarefas gerenciar = new GerenciadorDeTarefas();

		while (continuar == true) { // LOOP

			System.out.println();
			System.out.println("1. Criar uma nova tarefa");
			System.out.println("2. Listar todas as tarefas");
			System.out.println("3. Marcar uma tarefa como concluida");
			System.out.println("4. Remover uma tarefa");
			System.out.println("0. Sair");

			int opc1 = sc.nextInt();
			if (opc1 == 0) { // Terminar
				continuar = false;
				System.out.println("você escolheu sair");
				sc.close();
				break;
			}

			switch (opc1) { // Switch de opções
			case 1:
				System.out.println();
				System.out.println("Adicione o ID da tarefa!");
				int id = sc.nextInt();
				System.out.println();
				System.out.println("Adicione a descricao da tarefa!");
				sc.nextLine();
				String desc = sc.nextLine();
				System.out.println();
				System.out.println("Adicione o status da tarefa");
				boolean status = sc.nextBoolean();
				gerenciar.adicionarTarefa(id, desc, status);
				break;
			case 2:
				System.out.println("");
				System.out.print(gerenciar.listarTarefas());
				break;

			case 3:
			    System.out.println("Informe o número da tarefa que quer mudar o status:");
			    System.out.println(gerenciar.listarTarefas());
			    
			    int indexTarefa = sc.nextInt();
			    System.out.println("1. Define a Tarefa como completa");
			    System.out.println("2. Define a Tarefa como incompleta");
			    
			    int opcStatus = sc.nextInt();
			    gerenciar.marcarStatus(indexTarefa - 1, opcStatus);
			    break;
			case 4:
				System.out.println("");
				System.out.println("Informe o ID da tarefa que deseja remover");
				System.out.println();
				int opc2 = sc.nextInt();
				gerenciar.removerTarefa(opc2);
				break;

			default:
				System.out.println("");
				System.out.println("Opção invalida!");
				System.out.println();
				break;
			}
		}

		sc.close();
	}

}
