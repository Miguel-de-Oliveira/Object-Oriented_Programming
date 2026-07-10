package aulas.aula03ConstrutorEEncapsulamento.TermometroDigital;

public class TermometroDigital {
	private double temperatura;
	private String nrSerie;
	private char tipo;
	private String diagnostico;

	public TermometroDigital(String nrSerie, char tipo) {
		this.nrSerie = nrSerie;
		this.tipo = tipo;
	}

	public String getNrSerie() {
		return nrSerie;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public double getTemperatura() {
		return temperatura;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public void aferirTemperatura(double temperatura) {
		this.temperatura = temperatura;
		lerDiagnostico();
	}
	
	private String lerDiagnostico() {
		if(this.temperatura < 35.5) {return this.diagnostico = "Hipotermia";}
		if(this.temperatura < 37)   {return this.diagnostico = "Normal";}
		if(this.temperatura < 37.9) {return this.diagnostico = "Estado Febril";}
		if(this.temperatura < 38.9) {return this.diagnostico = "Febre";}
		if(this.temperatura < 39.9) {return this.diagnostico = "Febre Alta";}
		return this.diagnostico = "Hipertermia";
	}
}