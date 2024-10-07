package sistemagerenciamento.model;

import java.util.ArrayList;
import java.util.List;

import sistemagerenciamento.controller.Estudante;

public class GerenciamentoEstudantes {
	private List<Estudante> estudantes;
	
	public GerenciamentoEstudantes() {
		estudantes = new ArrayList<>();
	}
	
	//Adciona um novo estudante a lista
	public void adicionarEstudante(Estudante estudante) {
		if (estudante != null && !estudantes.contains(estudante)) {
			estudantes.add(estudante);
			//System.out.println("Estudante adicionado com sucesso.");
		} else {
			System.out.println("Estudante já existe ou é inválido.");
		}
	}
	
	public void removerEstudante(String matricula) {
		for (Estudante estudante : estudantes) {
			if (estudante.getMatricula().equals(matricula)) {
				estudantes.remove(estudante);
				System.out.println("Estudante removido com sucesso.");
				return;
			}
		}
		System.out.println("Estudante não encontrado.");
	}
	public void listarEstudantes() {
		if(estudantes.isEmpty()) {
			System.out.println("Nenhum estudante cadastrado.");
		} else {
			for (Estudante estudante: estudantes) {
				estudante.exibirInfo();
				System.out.println("---------------");
			}
		}
	}
	
	public Estudante buscarEstudante (String matricula) {
		for (Estudante estudante : estudantes) {
			if (estudante.getMatricula().equals(matricula)) {
				return estudante;
			}
		}
		System.out.println("Estudante não encontrado");
		return null;
	}
}