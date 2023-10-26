package fundamentos.logicos;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 3);
		System.out.println(3 >= 3);
		System.out.println(3 < 4);
		System.out.println(30 <= 3);
		//System.out.println(3 == 3);
		System.out.println(30 != 15);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passou = (nota >= 6) && bomComportamento;
		
		System.out.println("Passou? " + passou);
	}
}
