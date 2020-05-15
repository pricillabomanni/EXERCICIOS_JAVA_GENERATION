package ExercicioJava;

/* Faça um
programa que mostre uma contagem na tela de 233 a 456, só que contando de
3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

public class Ex03_ContandoCincoEmCincoETresEmTres {
	
	public static void main(String[] args) {
		
		for (int i = 233; i < 457; i++) {
			
			if(i > 300 && i < 400) {
				
				i = i + 2;
				System.out.println("Feito de 3 em 3: " + i);
				
			}else {
				
					i = i + 4;
					System.out.println("Feito de 5 em 5: " + i);
				}			
		}
		
		
		
	}
}
