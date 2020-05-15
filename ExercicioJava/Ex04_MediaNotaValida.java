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
		
		Scanner teclado = new Scanner (System.in);
		
		int i =1;
		double peso1, peso2, media;
		
		
		while(i < 6){
		
		System.out.print("Digite seu nome: ");
		String nomeAluno = teclado.next();
		
		System.out.print("Digite sua nota 1: ");
		double notaA = teclado.nextDouble();
		System.out.print("Digite sua nota 2: ");
		double notaB = teclado.nextDouble();
		
		peso1 = notaA * 1;
		peso2 = notaB * 2;
		
		media = (peso1 + peso2)/2;
		
		
		if(media >= 0 && media < 10) {
			System.out.println("Olá aluno, " + nomeAluno + ", sua nota 1 foi: " + peso1 + ", e sua nota 2 foi: "+ peso2 + ". Portanto sua media final é de: "+ media);
		}else {
			System.out.println("Sua nota é invalida, verifique com a secretaria! ");
			System.out.println();
		}
				
		
		 i++;
		}
		
		
	}
	
}
