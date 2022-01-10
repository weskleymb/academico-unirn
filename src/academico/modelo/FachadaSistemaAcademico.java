package academico.modelo;

import java.util.List;

import academico.dao.CadastroDepartamentoMemoria;

public class FachadaSistemaAcademico {

	private static FachadaSistemaAcademico singleton = null;

	public synchronized static FachadaSistemaAcademico getInstance() {

		if (singleton == null) {
			singleton = new FachadaSistemaAcademico();
		}

		return singleton;
	}

	private CadastroDepartamento cadastroDepartamento;

	private FachadaSistemaAcademico() {

		this.cadastroDepartamento = new CadastroDepartamentoMemoria();
		// Cria alguns departamentos por padr�o
		Departamento departamento = new Departamento(
				"Departamento de Inform�tica e Matem�tica Aplicada");
		this.cadastroDepartamento.inserir(departamento);
		Professor professor = new Professor("Eduardo Aranha", departamento);
		professor = new Professor("Roberta Coelho", departamento);
		professor = new Professor("Uir� Kulesza", departamento);

		// Outros departamentos
		departamento = new Departamento("Departamento de Letras");
		this.cadastroDepartamento.inserir(departamento);
		departamento = new Departamento("Departamento de Administra��o");
		this.cadastroDepartamento.inserir(departamento);

		// TODO: inserir professores no cadastro de professor!!!
	}

	public void inserir(Departamento dep) {
		cadastroDepartamento.inserir(dep);
	}

	public void alterar(Departamento dep) {
		cadastroDepartamento.alterar(dep);
	}

	public void remover(Departamento dep) {
		cadastroDepartamento.remover(dep);
	}

	public List<Departamento> listarDepartamentos() {
		return cadastroDepartamento.listarDepartamentos();
	}
}
