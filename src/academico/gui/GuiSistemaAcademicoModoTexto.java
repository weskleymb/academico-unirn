package academico.gui;

import java.util.Scanner;

import academico.modelo.Departamento;
import academico.modelo.Professor;
import academico.modelo.FachadaSistemaAcademico;


public class GuiSistemaAcademicoModoTexto {

	private Scanner in = new Scanner(System.in);
	
	public GuiSistemaAcademicoModoTexto() {
	}
	
	public void run() {
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("======== Escolha uma opção ========");
			System.out.println("1 - Cadastro de departamentos");
			System.out.println("2 - Cadastro de professores");
			System.out.println("0 - Sair");
			opcao = in.nextInt();
			switch (opcao) {
			case 1:
				opcao = cadastroDepartamento();
				break;
			case 2:
				System.out.println("FALTA IMPLEMENTAR...");
				break;
			}
		}
	}
	
	private int cadastroDepartamento() {
		int opcao = -1;
		while (opcao != 0 && opcao != 9) {
			System.out.println("======== Escolha uma opção ========");
			System.out.println("1 - Inserir departamento");
			System.out.println("2 - Atualizar departamento");
			System.out.println("3 - Remover departamento");
			System.out.println("4 - Procurar departamento");
			System.out.println("5 - Listar departamentos");
			System.out.println("9 - Voltar ao menu principal");
			System.out.println("0 - Sair do programa");
			opcao = in.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do departamento:");
				Departamento dep = new Departamento(in.next());
				FachadaSistemaAcademico.getInstance().inserir(dep);
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("FALTA IMPLEMENTAR...");
				break;
			case 5:
				for (Departamento departamento : FachadaSistemaAcademico.getInstance().listarDepartamentos()) {
					System.out.print(departamento.getNome());
					System.out.print(" - ");
					for (Professor prof : departamento.listarProfessores()) {
						System.out.print(prof.getNome());
						System.out.print(", ");
					}
					System.out.println();
				}
				break;
			}
		}
		return opcao;
	}
	
	public static void main(String[] args) {
		new GuiSistemaAcademicoModoTexto().run();
	}
}
