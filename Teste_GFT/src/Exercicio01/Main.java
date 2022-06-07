package Exercicio01;

public class Main {

	public static void main(String[] args) {
		Produto banana = new Produto("Banana",0.99,2);
	     Produto energetico = new Produto("Energetico",5.49,3);
	     Produto arroz = new Produto("Arroz",20.00,1);
	     Produto chocolate = new Produto("Chocolate",4.50,1);
	     Produto leite = new Produto("Leite",3.73,3);
	     Produto abacaxi = new Produto("Abacaxi",2.40,2);

	     Caixa caixa = new Caixa();

	     double valorBanana=caixa.calculaValorFinal(banana, 3);
	     double valorEnergetico=caixa.calculaValorFinal(energetico, 7);
	     double valorArroz=caixa.calculaValorFinal(arroz, 1);
	     double valorChocolate=caixa.calculaValorFinal(chocolate, 12);
	     double valorLeite=caixa.calculaValorFinal(leite, 5);
	     double valorAbacaxi=caixa.calculaValorFinal(abacaxi, 1);

	        System.out.println("Caixa \n"
	                +"Banana R$:"+valorBanana+"\n" 
	                +"Energetico R$:"+valorEnergetico+"\n"
	                +"Arroz R$:"+valorArroz+"\n"
	                +"Chocolate R$:"+valorChocolate+"\n"
	                +"Leite R$:"+valorLeite+"\n"
	                +"Abacaxi R$:"+valorAbacaxi+"\n");

	    }

	}

