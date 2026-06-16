package massaCorporea;

public class MassaCorporea {
	double peso;
	double altura;
	double imc;
	String situacao;
	
	void calcularImc() {
		imc = peso / (altura*altura);
		//Não dá return pois só quero armazenar o valor da conta no imc
	}
	
	void definirSituacao() {
		if(imc < 17) {situacao = "Muito abaixo do peso.";}
		if(imc < 18.5) {situacao = "Abaixo do peso.";}
		if(imc < 25) {situacao = "Peso normal.";}
		if(imc < 30) {situacao = "Acima do peso.";}
		if(imc < 35) {situacao = "Obesidade grau 1";}
	}
}