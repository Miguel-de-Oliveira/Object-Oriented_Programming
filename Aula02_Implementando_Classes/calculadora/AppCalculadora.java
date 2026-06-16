package calculadora;

public class AppCalculadora {
	public static void main(String[] args) {
		// Declarando e instanciando o objeto da classe Calculadora.
		Calculadora calculadora = new Calculadora();
		//Atribuindo dados aos atributos do objeto
		calculadora.operador1 = 10;
		calculadora.operador2 = 1;
		//Chamando os métodos do objeto com o retorno de cada um.
		System.out.printf("Operação soma.........: %d", calculadora.adicao());
		System.out.printf("\nOperação subtração....: %d", calculadora.subtracao());
		System.out.printf("\nOperação divisão......: %d", calculadora.divisao());
		System.out.printf("\nOperação multiplicação: %d", calculadora.multiplicacao());
	}
}