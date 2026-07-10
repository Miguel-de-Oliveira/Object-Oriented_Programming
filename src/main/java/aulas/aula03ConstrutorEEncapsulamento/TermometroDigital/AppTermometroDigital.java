package aulas.aula03ConstrutorEEncapsulamento.TermometroDigital;

import java.util.Scanner;

public class AppTermometroDigital {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Texto para console
		System.out.println("Número de série do termômetro: ");
		String nrSerie = input.next();
		System.out.println("Tipo do termômetro: ");
		char tipo = input.next().charAt(0);
		
		TermometroDigital td = new TermometroDigital(nrSerie, tipo);
		td.aferirTemperatura(38.5);
		
		System.out.printf("Número de série do termômetro: %s \n"
				+ "Tipo do termômetro: %s \n"
				+ "Temperatura aferida: %.2f \n"
				+ "Diagnóstico: %s", 
				td.getNrSerie(), td.getTipo(), td.getTemperatura(), td.getDiagnostico());
		
	
		
	}

}
