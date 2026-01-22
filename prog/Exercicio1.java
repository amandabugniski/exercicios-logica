package exercicios.logica.prog;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("***Loja de Doces do Léo***");

		int quantidadeDoces = 3;

		System.out.printf("\nQuantos tipos de doces você quer cadastrar ? ");

		int doces = entrada.nextInt();

		entrada.nextLine();

		quantidadeDoces = doces;

		if (doces <= 0) {
			System.out.println("Quantidade inválida! Usando 3 tipos de doces por padrão.");
			quantidadeDoces = 3;
		}

		int totalPromo = 0;
		int totalEmFalta = 0;
		int totalNormais = 0;

		for (int i = 1; i <= quantidadeDoces; i++) {
			System.out.println("=== Doce " + i + " ===");

			System.out.println("Qual o nome do doce?");

			String nomeDoce = entrada.nextLine();

			System.out.println("Esse doce está em promoção ? S/N ");

			String promo = entrada.nextLine().toLowerCase();

			if (promo.equals("s")) {
				totalPromo++;
			} else if (promo.equals("n")) {
				totalNormais++;
			} else {
				System.out.println("Resposta de promoção inválida, considerando como 'n'.");
				totalNormais++;
			}

			System.out.println("Esse doce está em falta ? S/N ");

			String doceFalta = entrada.nextLine().toLowerCase();

			if (doceFalta.equals("s")) {
				totalEmFalta++;
			} else if (doceFalta.equals("n")) {
				totalNormais++;
			} else {
				System.out.println("Resposta de falta inválida, considerando como 'n'.");
				totalNormais++;
			}
		}

		System.out.printf("Doces em promoção: " + totalPromo + "\nDoces em falta: " + totalEmFalta + "\nDoces normais: "
				+ totalNormais);

		if (totalEmFalta > 0) {
			System.out.printf("\nAtenção! Tem doce em falta, é bom repor o estoque!!");
		} else if (totalPromo == 0) {
			System.out.printf("\nNenhum doce em promoção hoje.");
		} else if (totalPromo > 0 && totalEmFalta == 0) {
			System.out.printf("\nA Loja do Léo está perfeita: doces em promoção e nada em falta!");
		}

		entrada.close();
	}
}