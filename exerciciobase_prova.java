package aula_programa��o;

import java.util.Scanner;

public class exerciciobase_prova {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double num1, num2;
	String operacao;
	double resultado;
	
	 do {
		 
		 System.out.println("Digite o 1� valor: ");
		 num1 = entrada.nextDouble();
		 System.out.println("Digite o 2� valor: ");
		 num2 = entrada.nextDouble();
		 System.out.println("Opera��es: ");
		 System.out.println("A - Adi��o");
		 System.out.println("S - subtra��o");
		 System.out.println("M - multiplica��o");
		 System.out.println("D - divis�o");
		 System.out.println("Informe a opera��o: ");
		 operacao = entrada.nextLine().toUpperCase();
		 
		 switch(operacao) {
			case "A":
				resultado = num1 + num2;
				System.out.println("o resultado �: " + resultado);
				break;
			case "S":
				resultado = num1 - num2;
				System.out.println("o resultado �: " + resultado);
				break;
			case "M":
				resultado  = num1 * num2;
				System.out.println("o resultado �: " + resultado);
				break;
			case "D":
				if(num2 == 0) {
					System.out.println(" divis�o invalida");
				}else {
					resultado = num1 / num2;
					System.out.println("o resultado �: " + resultado);
				}
				break;
			default:
				System.out.println("opera��o indisponivel");
			}
		 
		 
	 } while (num1 != -999);
	System.out.println("programa finalizado");
	
	entrada.close();
		
	}
	
		
	
	
	
	
	
}	
