package ExercicioJava;


/*1- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
at� 500.*/


public class Ex01_SomarImparMultiploDeTres {
	public static void main(String[] args) {
				
		int soma = 0;
		for (int i = 1; i < 501; i++) {
			
			if (i%2 != 0 && i%3==0) {
				
				//System.out.println(i);
				 soma = soma + i;				
			}			
			
		}		
		System.out.println("O resultado da soma dos impares: " + soma);
	}
}
