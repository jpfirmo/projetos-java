package teste02java;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a operação aritmetica desejada: ");
		String operacao = entrada.nextLine();
		System.out.println("digite um número: ");
		double n1 = entrada.nextDouble();
		System.out.println("digite um número: ");
		double n2 = entrada.nextDouble();
		double multiplicacao = n1 * n2;
		double divisao = n1 / n2;
		double adicao = n1 + n2;
		double subtracao = n1 - n2;
		if(operacao.equals("multiplicação")) {
			System.out.println(" resultado da multiplicação: " + multiplicacao);
		}else if(operacao.equals("divisao")){
			System.out.println("resultado da divisao: " + divisao);
		}else if(operacao.equals("adição")) {
			System.out.println("resultado da adição: " + adicao);
		}else if(operacao.equals("subtracao")) {
			System.out.println("resultado da subtração: " + subtracao);
		}
		
		
		
		
		
	}
}
