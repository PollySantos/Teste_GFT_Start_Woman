package Exercicio03;

import Exercicio03.Interface.Imposto;

public class COFINS implements Imposto {

	    @Override
	    public double calculaImposto(double valor) {
	        if(valor>17000){
	             return(valor*0.08);
	        }
	        return 0;

	    }

	}
