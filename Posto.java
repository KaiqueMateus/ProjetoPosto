package Principal;

import java.io.IOException;
import java.util.Scanner;
import calculos.Alcool;
import calculos.Diesel;
import calculos.Gasolina;
import calculos.Gnv;

public class ProgOO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    float alcool,diesel,gasolina,gnv;
	    int combustivel, litros = 0, total = 0,  totalc = 0 ,totdie = 0,totgas = 0,totgnv = 0, somalit = 0, somalitalc = 0,somalitdie = 0,somalitgas = 0,somalitgnv = 0;
	    int resp;

	    System.out.print("Deseja Abastecer (1 - Sim/ 0 - Não):");
	    resp = entrada.nextInt();
	    while (resp == 1) {
	    		System.out.println("($)TABELA DE PREÇOS($):\n");
	    		System.out.println("1 - Álcool: R$5,69\n");
	    		System.out.println("2 - Diesel:R$2,96\n");
	    		System.out.println("3 - Gasolina:R$6,07\n");
	    		System.out.println("4 - GNV:R$4,15\n");
	    		System.out.println("5 - PARA ENCERRAR!\n");
	    		System.out.print("Escolha seu Combustível:");
	    		combustivel = entrada.nextInt();
	    		switch (combustivel) {
	    			case 1 : combustivel = 1;
	    					System.out.print("Quantos Litros deseja abastecer?");
	    					litros = entrada.nextInt();
	    					totalc++;
	    					somalitalc = somalitalc + litros;
	    			break;
	    			case 2 : combustivel = 2;
	    					System.out.print("Quantos Litros deseja abastecer?");
							litros = entrada.nextInt();
							totdie++;
							somalitdie = somalitdie + litros;
					break;
	    			case 3 : combustivel = 3;
	    					System.out.print("Quantos Litros deseja abastecer?");
	    					litros = entrada.nextInt();
	    					 totgas++;
	    					 somalitgas = somalitgas + litros;
	    			break;
	    			case 4 : combustivel = 4;
	    					System.out.print("Quantos Litros deseja abastecer?");
	    					litros = entrada.nextInt();
	    					totgnv++;
	    					somalitgnv = somalitgnv + litros;
	    			break;
					default :
							System.out.println("\nAtendimento Completo!\n");
	    		}
	    	System.out.print("Deseja Abastecer (1 - Sim/ 0 - Não):");
			resp = entrada.nextInt();
	    	somalit = somalit + litros;
	    	total++;
	    }
	    System.out.println("\n___________________________________________\n");
	    System.out.println("\nTOTAL DE CONSUMO HOJE\n");
	    System.out.println("\n___________________________________________\n");
	    
	    System.out.println("Quantidade de Álcool consumido foi: " + somalitalc);
	    System.out.println("Quantidade de Diesel consumido foi: " + somalitdie);
	    System.out.println("Quantidade de Gasolina consumido foi: " + somalitgas);
	    System.out.println("Quantidade de GNV consumido foi: " + somalitgnv);
	    System.out.println("\n___________________________________________\n");
	    System.out.println("\nVALOR ARRECADADO POR COMBUSTÍVEL\n");
	    alcool   = new Alcool(somalitalc).calc_comb();
	    System.out.println("\nValor arrecadado de Álcool: R$" + alcool);
	    diesel   = new Diesel(somalitdie).calc_comb();
	    System.out.println("\nValor arrecadado de Diesel: R$" + diesel);
	    gasolina = new Gasolina(somalitgas).calc_comb();
	    System.out.println("\nValor arrecadado de Gasolina: R$" + gasolina);
	    gnv      = new Gnv(somalitgnv).calc_comb();
	    System.out.println("\nValor arrecadado de GNV: R$" + gnv);
	    System.out.println("\n___________________________________________\n");
	    System.out.println("\nQUANTIDADE DE VEÍCULOS POR COMBUSTÍVEL\n");
	    System.out.println("\n___________________________________________\n");
	    System.out.println("\nQuantidade de Veículos abastecidos: " + total);
	    System.out.println("\nÁlcool: " + totalc);
	    System.out.println("\nDiesel: " + totdie);
	    System.out.println("\nGasolina: " + totgas);
	    System.out.println("\nGNV: " + totgnv);
	    entrada.close();
	}

}
