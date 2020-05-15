package ExercicioJava;

/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O
programa deve fazer as leituras dos valores enquanto o usuário estiver
fornecendo valores positivos. Ou seja, o programa deve parar quando o
usuário fornecer um valor negativo*/


import java.util.Scanner;

public class EX05_LerNumPositivoPararProgramaComNumNegativo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int soma = 0;		
		int numLidos = 0;
		int media = 0 ;
		
		for (int i=0; i<= 3 ; i++) {
			
			System.out.print("Digite um numero: ");
			int numeros = teclado.nextInt();
			soma = soma + numeros; 			
			numLidos = i + 1;
			media = soma/numLidos;
			
			if(numeros >= 0) {
				System.out.println("É num positivo: " + numeros);
			}else {
				System.out.println("É num negativo: " + numeros);
				break;
			}
			
			
		
			System.out.println("A soma total é: " + soma);
			System.out.println("A media dos numeros é: " + media);
			System.out.println("total numeros lidos é: " + numLidos);
			System.out.println();
			
		}
		
		
		
	}
}
