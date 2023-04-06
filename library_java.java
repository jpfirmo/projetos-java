import java.util.Scanner;

public class library_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o nome do livro: ");
		String namebook = entrada.nextLine();
		System.out.println("digite a forma de pagamento");
		String formapagamento = entrada.nextLine();
		System.out.println("digite o preço do livro: ");
		double precobook = entrada.nextDouble();
		double cartao = precobook + (precobook * 0.10);
		double boleto = precobook - (precobook * 0.15);
		double pix = precobook - (precobook * 0.20);
		double dinheiro = precobook - (precobook * 0.20);
		switch(formapagamento) {
		    case "cartão":
			System.out.println("valor da compra: " + cartao + "R$");
			break;
		    case "boleto":
		    	System.out.println("valor da compra: " + boleto + "R$");
		    	break;
		    case "pix":
		    	System.out.println("valor da compra: " + pix + "R$");
		    	break;
		    case "dinheiro":
		    	System.out.println("valor da compra: " + dinheiro + "R$");
		    	break;
		}
		entrada.close();
	}

}
