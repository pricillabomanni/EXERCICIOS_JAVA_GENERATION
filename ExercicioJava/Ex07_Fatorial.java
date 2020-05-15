package ExercicioJava;

import java.util.Scanner;

/* Escrever um sistema que lê um valor N inteiro e positivo e que calcula e
escreve
o valor de E. E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!*/

public class Ex07_Fatorial {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double e = 0, fatorial = 0;
		System.out.println("Digite um valor inteiro: ");
		int num = teclado.nextInt();
		
		for (int i = 0; i < num ; i++) {
			
			if(i == 0) {
				e+=1;
				fatorial = 1;
			}else {
				fatorial *= i;
				e += (1/fatorial);
			}			
		}
		System.out.println("Resultado do E, é: " + e);
	}
}
