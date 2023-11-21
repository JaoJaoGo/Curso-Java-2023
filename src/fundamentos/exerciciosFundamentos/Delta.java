package fundamentos.exerciciosFundamentos;

import java.util.Scanner;

public class Delta {
	public static void main(String[] args) {
		// 6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
		// Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de ax²: ");
		int a = entrada.nextInt();
		
		System.out.print("Digite o valor de bx: ");
		int b = entrada.nextInt();
		
		System.out.print("Digite o valor de c: ");
		int c = entrada.nextInt();
		
		entrada.close();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("%nSua equação é: %dx² + %dx + %d = 0%n", a, b, c);
		System.out.printf("Valor de delta é: %d\n", delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO valor de x1 é: %.2f\nO valor de x2 é: %.2f", x1, x2);
	}
}
