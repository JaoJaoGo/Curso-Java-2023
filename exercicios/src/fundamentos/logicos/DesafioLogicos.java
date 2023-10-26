package fundamentos.logicos;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		System.out.printf("Trabalho de terça deu certo? %b%n", trabalhoTerca);
		System.out.printf("Trabalho de quinta deu certo? %b%n", trabalhoQuinta);
		
		boolean Tv50 = trabalhoTerca && trabalhoQuinta;
		boolean Tv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean sorvete = Tv50 || Tv32;
		boolean saudavel = !sorvete;
		
		System.out.printf("Comprou uma Tv de 50 polegadas? %b%n", Tv50);
		System.out.printf("Comprou uma Tv de 32 polegadas? %b%n", Tv32);
		
		System.out.printf("Tomou um sorvete? %b%n", sorvete);
		System.out.printf("Está saudável? %b%n", saudavel);
	}
}
