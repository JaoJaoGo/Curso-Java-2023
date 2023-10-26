package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		int raio = 3;
		final double PI = 3.14159;
		
		double res = raio * raio * PI;
		
		System.out.println(res);
		
		raio = 10;
		res = raio * raio * PI;
		
		System.out.println("Area = " + res + "m2.");
	}
}