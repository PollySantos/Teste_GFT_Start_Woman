package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNumero {

	public static void main(String[] args) {
	List<Double> numero = new ArrayList<Double>();
        ArrayList acimaDeCinquenta = new ArrayList<>(); 
        ArrayList acimaDeDez = new ArrayList<>(); 
        Scanner leitura = new Scanner(System.in);
        double maior=0;
        double menor=0;
        double media=0;
        double somatorio=0;

        for(int i=0;i<9;i++){
           System.out.println("Digite numero: ");
           double valorNumero= Double.parseDouble(leitura.next());
           if(!numero.contains(valorNumero)){
               numero.add(valorNumero);
           }
        }
        for(Double valor: numero){
             somatorio +=valor;
      if(valor > maior){ 
            maior = valor;
          }
          if(valor < menor){
            menor = valor;
          }

      if(valor>10)
          {
            acimaDeDez.add(valor) ;
          }
          if(valor >50)
          {
            acimaDeCinquenta.add(valor);
          } 
    }

        media=somatorio/numero.size();
        System.out.println("Maior valor = "+ maior);
   	System.out.println("Menor valor = "+ menor);
        System.out.println("Media  = "+ media);
        System.out.println("Numeros acima de dez = "+ acimaDeDez);
    	System.out.println("Quantidade de numeros acima de dez = "+ acimaDeDez.size());
        System.out.println("Numeros acima de cinquenta = "+ acimaDeCinquenta);
    	System.out.println("Quantidade de numeros acima de cinquenta = "+ acimaDeCinquenta.size());

    }

	}

}
