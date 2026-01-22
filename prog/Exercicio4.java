package exercicios.logica.prog;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cafeteria da Manu");

		int cafesVendidos = 0;
		int chasVendidos = 0;

		while (true) {
			System.out.printf("""
					=== Menu Cafeteria ===
					1 - Registrar um café vendido
					2 - Registrar um chá vendido
					3 - Ver resumo parcial do dia
					0 - Encerrar o expediente
										""");

			int opcaoMenu = entrada.nextInt();

			if (opcaoMenu == 1) {
				System.out.println("Café registrado!");
				cafesVendidos++;
			} else if (opcaoMenu == 2) {
				System.out.println("Chá registrado!");
				chasVendidos++;
			} else if (opcaoMenu == 3) {
				System.out.println("Cafés vendidos: " + cafesVendidos);
				System.out.println("Chás vendidos: " + chasVendidos);
			} else if (cafesVendidos + chasVendidos == 0) {
				System.out.println("Nenhuma bebida vendida ainda.");
			}

			if (opcaoMenu == 0) {
				break;
			} else if (opcaoMenu > 3 || opcaoMenu < 0) {
				System.out.println("Digite um número válido!");
			}
		}

		System.out.printf("""
				Cafés vendidos:%d
				Chás vendidos:%d
				""", cafesVendidos, chasVendidos);

		if (cafesVendidos == 0 && chasVendidos == 0) {
			System.out.println("Dia fraco na cafeteria hoje.");
		} else if (cafesVendidos > chasVendidos) {
			System.out.println("Hoje o pessoal preferiu café!");
		} else if (chasVendidos > cafesVendidos) {
			System.out.println("Hoje o pessoal preferiu chá!");
		} else if (cafesVendidos == chasVendidos) {
			System.out.println("Empate! Café e chá fizeram sucesso igual.");
		}

		entrada.close();
	}
}