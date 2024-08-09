package me.dio.web.lab01.lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> listaTarefas;
	
	public ListaTarefas() {
		this.listaTarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		this.listaTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa tarefa : listaTarefas) {
			if(tarefa.getDescricao().equals(descricao))
				tarefasParaRemover.add(tarefa);
		}
		this.listaTarefas.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return listaTarefas.size();
	}
	
	public void obterDescricoesTarefas() {
		for(Tarefa tarefa : listaTarefas) {
			System.out.println(tarefa.getDescricao());
		}
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 4");
		System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.removerTarefa("Tarefa 3");
		System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.obterDescricoesTarefas();
	}

}
