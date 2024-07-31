package exAula07;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
	ArrayList<String> tarefas = new ArrayList<>();
	
	public void adicionarTarefa(String tarefa) {
		tarefas.add(tarefa);
		System.out.println("Tarefa adicionada!\n");
	}
	
	public void removerTarefa(int indice) {
		if(indice > 0 && indice < tarefas.size()) {
			tarefas.remove(indice);
			System.out.println("Tarefa removida!\n");
		}
		else {
			System.out.println("Indice inválido!\n");

		}
	}
	
	int i;
	public void listarTarefa() {
		if(tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa na lista!");
		}
		else {
			System.out.println("Lista de Tarefas:");
				for(i=0; i< tarefas.size(); i++) {
					System.out.println(i + ": " + tarefas.get(i) + "\n");
				}
			}
		}
	}
	
