package sistemagerenciamento.controller;

public class Estudante {
	// Atributos
	private String nome;
	private String matricula;
	private String curso;
	private int idade;
	
	// Construtor
	public Estudante(String nome, String matricula, String curso, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.idade = idade;
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public int getIdade() {
		return idade;
	}
	
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser negativa");
		}
		this.idade = idade;
	}

	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Idade: " + idade);
		System.out.println("Curso: " + curso);
	}
}
