package aulas.aula02ImplementandoClasses.glicose;

public class Exame {
	
	int id;
	int nivelGlicose;
	
	public String obterDiagnostico() {
		if(nivelGlicose < 99){return "Normal";}
		if(nivelGlicose < 125){return "Pré-diabético(a)";}
		else {return "Diabético(a)";}
	}
}
