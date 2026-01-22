package exercicios.logica.prog;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***Planner de estudos da Amanda***");

		System.out.print("Quantos dias de estudo você quer planejar? ");

		int diasEstudo = entrada.nextInt();

		entrada.nextLine();

		int diasPlanejados = 0;

		if (diasEstudo <= 0) {
			System.out.println("Número inválido! Usando 5 dias por padrão.");
			diasEstudo = 5;
		}
		diasPlanejados = diasEstudo;

		int diasEstudados = 0;
		int diasProdutivos = 0;
		int diasNaoEstudados = 0;

		for (int i = 1; i <= diasEstudo; i++) {
			System.out.println("=== Dia " + i + " de estudo ===");

			System.out.print("Qual matéria você estudou ? ");

			String materia = entrada.nextLine();

			System.out.print("Você estudou de verdade essa matéria hoje? (S/N) ");

			String estudou = entrada.nextLine().toUpperCase();

			if (estudou.equals("S")) {
				diasEstudados++;
			} else if (estudou.equals("N")) {
				diasNaoEstudados++;
			} else {
				System.out.println("Resposta inválida, considerando como 'N'.");
				diasNaoEstudados++;
			}

			System.out.print("Você se sentiu produtivo hoje? (S/N) ");

			String produtivo = entrada.nextLine().toUpperCase();

			if (produtivo.equals("S")) {
				diasProdutivos++;
			}
		}

		System.out.printf("""
				Dias planejados:%d
				Dias que estudou:%d
				Dias produtivos:%d
				Dias sem estudo:%d
							""", diasPlanejados, diasEstudados, diasProdutivos, diasNaoEstudados);

		if (diasEstudados == 0) {
			System.out.println("Planner bonito, mas nada de estudo ainda! ");
		} else if (diasEstudados > 0 && diasEstudados < diasPlanejados) {
			System.out.println("Você começou bem, mas ainda dá pra melhorar a consistência.");
		} else if (diasEstudados == diasPlanejados) {
			System.out.println("Incrível! Você cumpriu todos os dias planejados!");
		} else if (diasProdutivos > diasNaoEstudados) {
			System.out.println("No geral, sua semana foi bem produtiva!");
		} else {
			System.out.println("Talvez seja bom revisar sua rotina para ficar mais produtiva.");
		}

		entrada.close();
	}
}