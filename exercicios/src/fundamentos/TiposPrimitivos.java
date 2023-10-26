package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//// Informações de um usuário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 27;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " dias.");
		
		// Números de viagens
		System.out.println(numeroDeVoos / 2 + " viagens");
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> R$" + salario);
		System.out.println("Está de Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
