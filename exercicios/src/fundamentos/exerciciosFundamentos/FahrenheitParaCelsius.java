package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		// 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheint: ");
		double f = entrada.nextDouble();
		
		entrada.close();
		
		double c = (f - 32) * (5.0 / 9.0);
		
		System.out.printf("Temperatura em Celsius: %.2f°C", c);
	}
}
