package fundamentos.exerciciosFundamentos;

import java.util.Scanner;
import java.lang.Math;

public class IMC {
	public static void main(String[] args) {
		// 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		entrada.close();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é: %.2f", imc);
	}
}
