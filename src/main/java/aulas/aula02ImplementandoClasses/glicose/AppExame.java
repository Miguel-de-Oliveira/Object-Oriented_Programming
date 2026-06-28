package aulas.aula02ImplementandoClasses.glicose;

import java.util.Scanner;

public class AppExame {

	public static void main(String[] args) {
		Exame exame = new Exame();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o id do Exame: ");
		exame.id = input.nextInt();
		System.out.println("Digite o nível da Glicose em mg/dL: ");
		exame.nivelGlicose = input.nextInt();
		
		System.out.print("----Resultado do Exame----\n");
		System.out.printf("Id: %d \nNível da Glicose: %d mg/dL \nResultado: %s", exame.id, exame.nivelGlicose, exame.obterDiagnostico());

	}

}
