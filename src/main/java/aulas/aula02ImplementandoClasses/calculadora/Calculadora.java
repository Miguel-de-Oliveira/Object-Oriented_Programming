package aulas.aula02ImplementandoClasses.calculadora;

public class Calculadora {
	int operador1;
	int operador2;
	
	int adicao() {
		return operador1 + operador2;
	}
	
	int subtracao() {
		return operador1 - operador2;
	}
	
	int multiplicacao() {
		return operador1 * operador2;
	}
	
	int divisao() {
		return operador1 / operador2;
	}
}