package maran.java.base.classesmetodos;

public class Usuario {	
	
	String nome;
	String email;

	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			// verificação simples
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		}
		
		return false;		
		
	}

}