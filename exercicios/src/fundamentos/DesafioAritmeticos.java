package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int formula1 = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		int formula2 = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		
		int dividendo = (int) Math.pow(formula1 - formula2, 3);
		int divisor = (int) Math.pow(10, 3);
		
		int resultado = dividendo / divisor;
		
		System.out.println(resultado);
	}
}
