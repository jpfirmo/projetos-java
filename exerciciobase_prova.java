package aula_programação;

import java.util.Scanner;

public class exerciciobase_prova {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double num1, num2;
	String operacao;
	double resultado;
	
	 do {
		 
		 System.out.println("Digite o 1° valor: ");
		 num1 = entrada.nextDouble();
		 System.out.println("Digite o 2° valor: ");
		 num2 = entrada.nextDouble();
		 System.out.println("Operações: ");
		 System.out.println("A - Adição");
		 System.out.println("S - subtração");
		 System.out.println("M - multiplicação");
		 System.out.println("D - divisão");
		 System.out.println("Informe a operação: ");
		 operacao = entrada.nextLine().toUpperCase();
		 
		 switch(operacao) {
			case "A":
				resultado = num1 + num2;
				System.out.println("o resultado é: " + resultado);
				break;
			case "S":
				resultado = num1 - num2;
				System.out.println("o resultado é: " + resultado);
				break;
			case "M":
				resultado  = num1 * num2;
				System.out.println("o resultado é: " + resultado);
				break;
			case "D":
				if(num2 == 0) {
					System.out.println(" divisão invalida");
				}else {
					resultado = num1 / num2;
					System.out.println("o resultado é: " + resultado);
				}
				break;
			default:
				System.out.println("operação indisponivel");
			}
		 
		 
	 } while (num1 != -999);
	System.out.println("programa finalizado");
	
	entrada.close();
		
	}
	
		
	
	
	
	
	
}	
