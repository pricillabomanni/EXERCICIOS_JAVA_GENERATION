package ExercicioJava;

import java.util.Scanner;

/**/

public class Ex08_MediaSalario {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		double salario, totalSalario = 0, mediaSalario = 0; 
		double numFilho = 0, totalFilho = 0, mediaFilho= 0;
		double porcentagemPessoa = 0, salario = 1;
		
		for (int i = 1; i < salario; i++) {
			
			System.out.print("Digite seu salario");
			salario = teclado.nextDouble();
			
			System.out.print("Digite o numero de filhos: ");
			numFilho = teclado.nextInt();
			
			totalSalario = totalSalario + salario;
			totalFilho = totalFilho + numFilho;
			
			mediaFilho = totalFilho/i;
			mediaSalario = totalSalario/i;		
			
			/*Falta retornar porcentagem e maior salario*/
					
		}
	
		System.out.println("Total salario: " + totalSalario + " Total filho: " + totalFilho);
		System.out.println("A media de filhos é: " + mediaFilho + " E a media de salario é: " + mediaSalario );
		System.out.println("Porcentagem de pessoa que recebe até cem reais: " + porcentagemPessoa);
		
				
		
		
				
				
	}
}
