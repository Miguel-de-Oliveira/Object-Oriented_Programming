package massaCorporea;
import java.util.Scanner;

public class AppMassaCorporea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MassaCorporea mc = new MassaCorporea();
		
		System.out.println("Peso..(kg): ");
		mc.peso = input.nextDouble();
		System.out.println("Altura(m): ");
		mc.altura = input.nextDouble();
		//Chamar os métodos para usar os valores inseridos
		mc.calcularImc();
		mc.definirSituacao();
		
		System.out.printf("IMC.....: %.1f\n", mc.imc);
		System.out.printf("Situação: %s", mc.situacao);
		input.close();
	}

}
