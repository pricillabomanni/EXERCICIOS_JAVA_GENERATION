package ExercicioJava;

/* Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O
programa deve fazer as leituras dos valores enquanto o usu�rio estiver
fornecendo valores positivos. Ou seja, o programa deve parar quando o
usu�rio fornecer um valor negativo*/


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
				System.out.println("� num positivo: " + numeros);
			}else {
				System.out.println("� num negativo: " + numeros);
				break;
			}
			
			
		
			System.out.println("A soma total �: " + soma);
			System.out.println("A media dos numeros �: " + media);
			System.out.println("total numeros lidos �: " + numLidos);
			System.out.println();
			
		}
		
		
		
	}
}
