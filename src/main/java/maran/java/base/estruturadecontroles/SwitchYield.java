package maran.java.base.estruturadecontroles;

public class SwitchYield {

	public static void main(String[] args) {
		
		String descricao = "fem";
		
		var sexo = switch(descricao.toUpperCase()) {
			case "F", "FEM", "FEMININO" : yield 1;
			case "M", "MASC", "MASCULINO" : yield 1;
			default: throw new RuntimeException("Fora do padrão");
		};
		
	}

}
