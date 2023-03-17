package teste01java;

import java.util.Scanner;

public class FPB_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("insira o valor do produto:");
		double produto = entrada.nextDouble();
		
		double x1 = produto / 1;
		double x2 = produto / 2;
		double x3 = produto / 3;
		double x4 = produto / 4;
		double x5 = produto / 5;
		
		System.out.println("valores das parcelas:");
		System.out.println("parcelado 1 vez:" + x1);
		System.out.println("parcelado 2 vezes:" + x2);
		System.out.println("parcelado 3 vezes:" + x3);
		System.out.println("parcelado 4 vezes:" + x4);
		System.out.println("parcelado 5 vezes:" + x5);
		
		
		
	}

}
