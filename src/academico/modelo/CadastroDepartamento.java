package academico.modelo;

import java.util.List;


public interface CadastroDepartamento {

	public void inserir(Departamento dep);

	public void alterar(Departamento dep);

	public void remover(Departamento dep);

	public List<Departamento> listarDepartamentos();

	public Departamento procurarDepartamento(String nome);

}