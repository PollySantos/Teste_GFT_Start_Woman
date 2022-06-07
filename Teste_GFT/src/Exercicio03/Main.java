package Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	       ICMS icms = new ICMS();
	       IPI ipi = new IPI();
	       COFINS cofins = new COFINS();
	       Scanner leitura = new Scanner(System.in);
	       double total=0;

	       System.out.printf("Digite um valor: ");
	       double valorUsuario = leitura.nextInt();
	       double impostoIcms=icms.calculaImposto(valorUsuario);
	       double impostoIpi=ipi.calculaImposto(valorUsuario);
	       double impostoCofins=cofins.calculaImposto(valorUsuario);
	       total+=(valorUsuario+impostoIcms+impostoIpi+impostoCofins);

	       System.out.println(
	                "ICMS R$:"+ impostoIcms+"\n"
	                +"IPI R$:"+ impostoIpi+"\n"
	                +"COFINS R$:"+impostoCofins+"\n"
	                +"Valor Final R$:"+total+"\n");
	    }
}