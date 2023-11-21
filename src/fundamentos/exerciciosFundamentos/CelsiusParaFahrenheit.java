package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		// 2. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double c = entrada.nextDouble();
		
		entrada.close();
		
		double f = c * 1.8 + 32;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f°F", f);
	}
}
