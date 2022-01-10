package academico.modelo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Departamento implements Comparable<Departamento> {

	private String nome;
	private Set<Professor> professores;
	
	public Departamento() {
		
	}

    public Departamento(String nome){
		this.nome = nome;
		this.professores = new HashSet<Professor>();
	}
    
	public void addProfessor(Professor prof){
		this.professores.add(prof);
	}
    
    public String getNome() {
    	return nome;
    }
    
	public Collection<Professor> listarProfessores(){
		return this.professores;
	}

	@Override
	public int compareTo(Departamento arg0) {
		return nome.compareTo(arg0.getNome());
	}    
    
}
