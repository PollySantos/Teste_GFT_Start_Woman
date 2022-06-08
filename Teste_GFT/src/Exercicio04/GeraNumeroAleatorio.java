package Exercicio04;

import java.util.Scanner;
import java.util.Random;

public class GeraNumeroAleatorio {

	public static void main(String[] args) {
		
		System.out.println("Digite um número entre 0 e 10: ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        Random random = new Random();

        int numero = random.nextInt(10)+1;
        System.out.println("Digite um número de 0 à 10: " + numero);

        if (n <= 10) {

            System.out.println("Deu boa!");
        } else {

            System.out.println("Não deu boa!");

         }

       }

}
		

	
