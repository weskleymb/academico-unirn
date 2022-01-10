package academico.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import academico.modelo.CadastroDepartamento;
import academico.modelo.Departamento;

public class CadastroDepartamentoMemoria implements CadastroDepartamento {

	private SortedSet<Departamento> departamentos;	

	public CadastroDepartamentoMemoria() {
		this.departamentos = new TreeSet<Departamento>();
	}
	
	@Override
	public void inserir(Departamento dep) {
		departamentos.add(dep);
	}

	@Override
	public void alterar(Departamento dep) {
		// Não precisa fazer nada
	}

	@Override
	public void remover(Departamento dep) {
		departamentos.remove(dep);
	}

	@Override
	public List<Departamento> listarDepartamentos() {
		return new ArrayList<Departamento>(departamentos);
	}

	@Override
	public Departamento procurarDepartamento(String nome) {
		Departamento retorno = null;
		for (Departamento dep : departamentos) {
			if (dep.getNome().equals(nome)) {
				retorno = dep;
				break;
			}
		}
		return retorno;
	}
}
