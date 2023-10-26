package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // Ocorreu conversão implícita! (1 foi convertido para 1.0)
		System.out.println(a);
		
		float f = (float) 1.123457891011; // Ocorreu conversão explícita! (CAST)
		double d = 1.1234567891011;
		
		System.out.println(f);
		System.out.println(d);
		
		int c = 4;
		byte b = (byte) c; // Ocorreu conversão explítica! (CAST)
		
		System.out.println(c);
		System.out.println(b);
		
		double e = 1.9999;
		int i = (int) e; // Ocorreu conversão explícita! (CAST)
		
		System.out.println(e);
		System.out.println(i);
	}
}
