package sistemagerenciamento.view;

import java.util.Scanner;

import sistemagerenciamento.controller.Estudante;
import sistemagerenciamento.model.GerenciamentoEstudantes;

public class Main {

	public static void main(String[] args) {
        GerenciamentoEstudantes sistema = new GerenciamentoEstudantes();
        Scanner sc = new Scanner(System.in); // Nomeado como 'sc'

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Estudantes");
            System.out.println("---------------------------------------");
            System.out.println("1. Adicionar Estudante");
            System.out.println("2. Buscar Estudante");
            System.out.println("3. Listar Estudantes");
            System.out.println("4.Remover Estudante");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt(); // Usando 'sc'
            sc.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1: // Adicionar Estudante
                    System.out.print("Digite o nome do estudante: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a matrícula do estudante: ");
                    String matricula = sc.nextLine();
                    System.out.print("Digite o curso do estudante: ");
                    String curso = sc.nextLine();
                    System.out.print("Digite a idade do estudante: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); // Consome a nova linha

                    Estudante estudante = new Estudante(nome, matricula, curso, idade);
                    sistema.adicionarEstudante(estudante);
                    System.out.println("\nEstudante adicionado com sucesso!\n");
                    break;

                case 2: // Buscar Estudante
                    System.out.print("Digite a matrícula do estudante que deseja buscar: ");
                    String matriculaBuscar = sc.nextLine();
                    Estudante estudanteEncontrado = sistema.buscarEstudante(matriculaBuscar);
                    if (estudanteEncontrado != null) {
                        System.out.println("\nEstudante encontrado:");
                        exibirEstudante(estudanteEncontrado);
                    } else {
                        System.out.println("Estudante não encontrado.\n");
                    }
                    break;

                case 3: // Listar Estudantes
                    System.out.println("\nLista de Estudantes:");
                    sistema.listarEstudantes();
                    break;
                    
                case 4: // Remover Estudante
                	System.out.print("Digite a matrícula do estudante que deseja remover: ");
                	String matriculaRemover = sc.nextLine();
                	sistema.removerEstudante(matriculaRemover);
                	break;
                	
                case 5: // Sair
                    System.out.println("Saindo do sistema...\n");
                    sc.close(); // Fecha o scanner
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
    }

    // Método para exibir as informações de um estudante
    private static void exibirEstudante(Estudante estudante) {
        System.out.printf("Nome: %s%n", estudante.getNome());
        System.out.printf("Matrícula: %s%n", estudante.getMatricula());
        System.out.printf("Idade: %d%n", estudante.getIdade());
        System.out.printf("Curso: %s%n", estudante.getCurso());
        System.out.println("---------------------------------------");
    }
}