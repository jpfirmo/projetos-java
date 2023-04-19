import java.util.Scanner;

public class chatgptlibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    String pedido = "";
	    double total = 0.0;
	    boolean finalizar = false;
	    
	    System.out.println("Bem-vindo(a) à livraria!");
	    
	    do {
	      System.out.println("Digite o código do livro que deseja comprar ou 'pf' para finalizar o pedido:");
	      pedido = input.nextLine();
	      
	      if (pedido.equals("pf")) {
	        finalizar = true;
	        continue;
	      }
	      
	      System.out.println("Digite o preço do livro:");
	      double preco = input.nextDouble();
	      input.nextLine();
	      
	      System.out.println("Digite a quantidade de livros:");
	      int quantidade = input.nextInt();
	      input.nextLine();
	      
	      double subtotal = preco * quantidade;
	      total += subtotal
	    		  ;
	      
	      System.out.println("Pedido adicionado:");
	      System.out.println("- Código do livro: " + pedido);
	      System.out.println("- Preço unitário: R$ " + preco);
	      System.out.println("- Quantidade: " + quantidade);
	      System.out.println("- Subtotal: R$ " + subtotal);
	      
	      System.out.println("Escolha a forma de pagamento (1 = Dinheiro, 2 = Cartão de crédito, 3 = Cartão de débito):");
	      int formaPagamento = input.nextInt();
	      input.nextLine();
	      
	      switch (formaPagamento) {
	        case 1:
	          System.out.println("Pagamento em dinheiro.");
	          break;
	        case 2:
	          System.out.println("Pagamento com cartão de crédito.");
	          break;
	        case 3:
	          System.out.println("Pagamento com cartão de débito.");
	          break;
	        default:
	          System.out.println("Forma de pagamento inválida.");
	          break;
	      }
	      
	    } while (!finalizar);
	    
	    System.out.println("Pedido finalizado.");
	    System.out.println("Total: R$ " + total);
	}

}
