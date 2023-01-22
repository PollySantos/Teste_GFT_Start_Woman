package Exercicio01;

public class Caixa {

	public double calculaValorFinal(Produto produto,int quantidade){
		double resultado=0;
		switch (produto.tipo) {
		       case 1:
		            resultado=(produto.valor*quantidade);
		            resultado= resultado-(resultado*0.10);
		       break;
		       case 2:
		            resultado=(produto.valor*quantidade);
		            resultado= resultado-(resultado*0.20);

		       break;
		       case 3:
		            if(quantidade>5){
		             resultado=(produto.valor*quantidade);
		             resultado= resultado-(resultado*0.10);
		            }
		             resultado=produto.valor*quantidade;
		      break;
		      default:
		             resultado=produto.valor*quantidade;
		      }
		return resultado;
		    };
		}



