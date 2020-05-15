package ExercicioJava;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *  Pede- se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
� o n�mero de pessoas calmas;
� o n�mero de mulheres nervosas;
� o n�mero de homens agressivos;
� o n�mero de pessoas nervosas com mais de 40 anos;
� o n�mero de pessoas calmas com menos de 18 anos;
*/

import java.util.Scanner;

public class Ex06_CaracteristicasPsicologicasOpcoes {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idade, sexo;		
		int opcao = 0;

		for (int i = 1; i < 5; i++) {

			System.out.println("Voc� se considera: ");
			System.out.println("1) Sou uma pessoa calma!");
			System.out.println("2) Sou uma pessoa nervosa!");
			System.out.println("3) Sou uma pessoa agressiva!");
			System.out.println("0) Cancelar pesquisa!");
			System.out.println();

			System.out.print("Digite a op��o desejada: ");
			opcao = teclado.nextInt();
			System.out.println();

			if (opcao != 0) {

				System.out.print("Digite sua idade: ");
				idade = teclado.nextInt();

				System.out.print("Sexo escolha o numero: 1)F ou 2)M: ");
				sexo = teclado.nextInt();

				if(sexo == 1 && opcao == 1) {
					System.out.println("Voc� � uma pessoa calma");
				}else if (sexo == 1 && opcao == 2) {
					System.out.println("Voc� � uma pessoa nervosa");
				}else if(sexo == 1 && opcao == 3) {
					System.out.println("Voc� � uma pessoa agressiva");
				}

				System.out.print("Oi, eu tenho: " + idade + " anos." + " Sou do sexo: " + sexo);
				System.out.println();
			}			

		}

	}

}
