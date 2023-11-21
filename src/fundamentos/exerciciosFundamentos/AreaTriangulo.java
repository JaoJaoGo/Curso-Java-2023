package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		// 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		double altura = entrada.nextDouble();
		
		entrada.close();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é: %.2f", area);
	}
}
