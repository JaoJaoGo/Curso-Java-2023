package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		// 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		entrada.close();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("Valor ao quadrado: %.2f%nValor ao cubo: %.2f", quadrado, cubo);
	}
}
