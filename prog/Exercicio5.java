package exercicios.logica.prog;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Diário de Humor do Robô Z3");

		int totalPessoas = 0;
		int totalFeliz = 0;
		int totalTriste = 0;
		int totalAnimado = 0;
		int totalOutro = 0;

		while (true) {
			System.out.print("Quer registrar o humor de uma pessoa? (s/n) ");

			String registro = entrada.nextLine().toLowerCase();

			if (registro.equals("n")) {
				System.out.printf("""

						Total de pessoas registradas:%d
						Felizes: %d
						Tristes: %d
						Animadas: %d
						Outros: %d
						""", totalPessoas, totalFeliz, totalTriste, totalAnimado, totalOutro);
				break;
			} else if (registro.equals("s")) {
				totalPessoas++;
			} else if (!registro.equals("s")) {
				System.out.println("Resposta inválida, considerando como 'N'.");
				continue;
			}

			System.out.print("Qual o nome da pessoa? ");

			String nome = entrada.nextLine();

			System.out.print("Como está o humor dela? (feliz/triste/animado/outro) ");

			String humor = entrada.nextLine().toLowerCase();

			if (humor.equals("feliz")) {
				System.out.println("Que bom! Z3 gosta de pessoas de bom humor.");
				totalFeliz++;
			} else if (humor.equals("triste")) {
				System.out.println("Z3 sugere um abraço e um chocolate quente.");
				totalTriste++;
			} else if (humor.equals("animado")) {
				System.out.println("Que bom! Z3 gosta de pessoas de bom humor.");
				totalAnimado++;
			} else {
				System.out.println("Humor diferente detectado, Z3 está curioso!");
				totalOutro++;
			}
		}

		if (totalPessoas == 0) {
			System.out.println("Z3 não conseguiu analisar ninguém hoje.");
		} else if (totalFeliz + totalAnimado > totalTriste) {
			System.out.println("Hoje, o clima geral foi mais positivo!");
		} else if (totalTriste > totalFeliz + totalAnimado) {
			System.out.println("Hoje o clima estava meio pesado, Z3 deseja dias melhores.");
		} else {
			System.out.println("Humores bem variados hoje, Z3 achou o dia interessante!");
		}

		entrada.close();
	}
}