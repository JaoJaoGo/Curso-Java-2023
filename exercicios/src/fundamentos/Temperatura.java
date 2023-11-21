package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double temperaturaF = 86.0;
		final int AJUSTE = 32;
		final double DIVISAO = 5.0 / 9.0;
		
		double temperaturaC = (temperaturaF - AJUSTE) * DIVISAO;

		System.out.println(temperaturaC + "°C.");
		
		temperaturaF = 150;
		temperaturaC = (temperaturaF - AJUSTE) * DIVISAO;
		
		System.out.println(temperaturaC + "°C.");
	}
}