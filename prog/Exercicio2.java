package exercicios.logica.prog;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***Missões do Jogo de Aventura***");

		System.out.print("Quantas missões você quer cadastrar? ");

		int missoes = entrada.nextInt();

		entrada.nextLine();
	
		if (missoes <= 0) {
			System.out.println("Número inválido! Usando 4 missões por padrão.");
			missoes = 4;
		}
		
		int missoesPrincipais = 0;
		int missoesSecundarias = 0;
		int missoesConcluidas = 0;
		int missoesPendentes = 0;

		for (int i = 1; i <= missoes; i++) {
			System.out.println("=== Missão " + i + " ===");

			System.out.print("Qual o nome da missão ? ");

			String nomeMissao = entrada.nextLine();

			System.out.print("Essa missão é principal ? (S/N) ");

			String missaoPrincipal = entrada.nextLine().toUpperCase();

			if (missaoPrincipal.equals("N")) {
				missoesSecundarias++;
			} else if (missaoPrincipal.equals("S")) {
				missoesPrincipais++;
			} else {
				System.out.println("Resposta inválida, considerando como missão secundária.");
				missoesSecundarias++;
			}

			System.out.print("Essa missão já foi concluída? (S/N) ");

			String missaoConclusao = entrada.nextLine().toUpperCase();

			if (missaoConclusao.equals("S")) {
				missoesConcluidas++;
			} else if (missaoConclusao.equals("N")) {
				missoesPendentes++;
			} else {
				System.out.println("Resposta inválida, considerando como missão pendente.");
				missoesPendentes++;
			}
		}

		System.out.printf("""

				Missões principais: %d
				Missões secundárias: %d
				Missões concluídas: %d
				Missões pendentes: %d
						""", missoesPrincipais, missoesSecundarias, missoesConcluidas, missoesPendentes);

		if (missoesConcluidas == 0) {
			System.out.println("O jogador não completou nenhuma missão ainda!");
		} else if (missoesPendentes == 0) {
			System.out.println("Todas as missões estão concluídas! Parabéns!");
		} else if (missoesPrincipais > missoesSecundarias) {
			System.out.println("O jogo está focado em história principal.");
		} else {
			System.out.println("O jogo tem muitas missões extras para explorar!");
		}
		
		entrada.close();
	}
}