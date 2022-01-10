package academico.modelo;

public class Professor {
	
    private String nome;

	public Professor(String nome, Departamento dpto){
		this.nome = nome;
		dpto.addProfessor(this);		
	}    

	public String getNome() {
		return nome;
	}
	
	public boolean equals(Professor prof) {
		return nome.equals(prof.getNome());
	}
    
}
