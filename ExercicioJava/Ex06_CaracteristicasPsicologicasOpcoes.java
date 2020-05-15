package ExercicioJava;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *  Pede- se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
• o número de pessoas calmas;
• o número de mulheres nervosas;
• o número de homens agressivos;
• o número de pessoas nervosas com mais de 40 anos;
• o número de pessoas calmas com menos de 18 anos;
*/

import java.util.Scanner;

public class Ex06_CaracteristicasPsicologicasOpcoes {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idade, sexo, mulNervosa = 0, homAgressivo = 0;
		int pesCalma = 0, calMenor18 = 0, nerMaior40 = 0;
		int opcao = 0;

		for (int i = 1; i < 5; i++) {

			System.out.print("Digite sua idade: ");
			idade = teclado.nextInt();
			System.out.print("Sexo escolha o numero: 1)F ou 2)M: ");
			sexo = teclado.nextInt();

			System.out.println("1) Sou uma pessoa calma!");
			System.out.println("2) Sou uma pessoa nervosa!");
			System.out.println("3) Sou uma pessoa agressiva!");
			System.out.println("0) Cancelar pesquisa!");
			System.out.println();

			System.out.println("Você se considera: ");
			opcao = teclado.nextInt();

			if (opcao != 0) {

				if (sexo == 1 && opcao == 2) {
					System.out.println("Numero de mulheres nervosas: " + ++mulNervosa);

				} if (sexo == 2 && opcao == 3) {
					System.out.println("Numero de homens agressivos: " + ++homAgressivo);

				} if (opcao == 1) {
					System.out.println("Numero de pessoas calmas: " + ++pesCalma);
					
				} if (opcao == 1 && idade < 18) {
					System.out.println("Numero de pessoas calmas menores de 18 anos: " + ++calMenor18);
					
				} if (opcao == 2 && idade > 40) {
					System.out.println("Numero de pessoas nervosas acima dos 40 anos: " + ++nerMaior40);
				}


			}
		}
	}
}
