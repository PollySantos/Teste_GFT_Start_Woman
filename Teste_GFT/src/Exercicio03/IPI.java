package Exercicio03;

import Exercicio03.Interface.Imposto;

public class IPI implements Imposto {

	    @Override
	    public double calculaImposto(double valor) {
	        if(valor>=25000){
	             return  (valor*0.10);
	        }else{
	            return(valor*0.05);
	        }
	    }
	}
