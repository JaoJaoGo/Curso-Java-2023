package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// Objeto String
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são as versões objeto de tipos primitivos
		int a = 123;
		// a.///
		System.out.println(a);
	}
}
