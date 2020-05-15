package ExercicioJava;

/*Ler
o nome de um aluno e as suas duas notas A e B, e após calcular a média
ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
procedimento para uma turma composta por cinco alunos, usando o comando
While.
*/

import java.util.Scanner;

public class Ex04_MediaNotaValida {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i = 0;
		double notaA = 0, notaB = 0, media = 0;

		while (i < 6) {

			System.out.print("Digite seu nome: ");
			String nomeAluno = teclado.next();

			System.out.print("Digite sua nota 1: ");
			notaA = teclado.nextDouble();
			System.out.print("Digite sua nota 2: ");
			notaB = teclado.nextDouble();

			media = (notaA + notaB * 2) / 3;

			if (media >= 0 && media < 10) {
				System.out.println("Olá aluno, " + nomeAluno + "sua média é: " + media);
			} else {
				System.out.println("Sua nota é invalida, verifique com a secretaria! ");
				System.out.println();
			}

			i++;
		}

	}

}
