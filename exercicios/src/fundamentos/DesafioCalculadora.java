package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		double num1;
		double num2;
		String operador;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de num1: ");
		num1 = entrada.nextDouble();
		
		System.out.print("\nDigite o valor de num2: ");
		num2 = entrada.nextDouble();
		
		System.out.print("\n+. Somar\n-. Subtrair\n*. Multiplicar\n/. Dividir\n%. Módulo\nDigite o operador: ");
		operador = entrada.next();
		
		entrada.close();
		
		if("+".equals(operador)) {
			double soma = num1 + num2;
			System.out.println("\n" + num1 + " + " + num2 + " = " + soma);
			
		} else if("-".equals(operador)) {
			double sub = num1 - num2;
			System.out.println("\n" + num1 + " - " + num2 + " = " + sub);
			
		} else if("*".equals(operador)) {
			double mult = num1 * num2;
			System.out.println("\n" + num1 + " * " + num2 + " = " + mult);
			
		} else if("/".equals(operador)) {
			double div = num1 / num2;
			System.out.println("\n" + num1 + " / " + num2 + " = " + div);
			
		} else if("%".equals(operador)) {
			double mod = num1 % num2;
			System.out.println("\n" + num1 + " - " + num2 + " = " + mod);
			
		}
	}
}
