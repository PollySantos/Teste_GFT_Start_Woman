package Exercicio03;

import Exercicio03.Interface.Imposto;

public class ICMS implements Imposto{
	    @Override
	    public double calculaImposto(double valor) {
	       return  (valor *0.30);
	    }
}
