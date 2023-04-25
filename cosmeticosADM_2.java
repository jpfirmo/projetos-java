import java.util.Scanner;

public class cosmeticosADM_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("bem vinda a loja de cosmeticos adm");
		String pedido;
		double preco = 0.0;
		int quantidade;
		double total = 0.0;
		do {
			System.out.println("informe um de tipo de produto ou digite 'pf' para finalizar o pedido ");
			System.out.println("---------------------------");
			System.out.println("1 - shampoo para cabelo ");
			System.out.println("2 - perfumes");
			System.out.println("3 - creme para pele");
			pedido = entrada.nextLine().toLowerCase();
			if(pedido.equalsIgnoreCase("1")){
			System.out.println("informe o tipo do seu cabelo: ");
			String typehair = entrada.nextLine().toLowerCase();
			switch(typehair) {
			 case "liso":
				 System.out.println("recomendamos o produto A");
				 preco = 30.00;
				  break;
			 case "cacheado":
				 System.out.println("recomendamos o produto B");
				 preco = 29.70;
				 break;
			 case "ondulado":
				 System.out.println("recomendamos o produto C");
				 preco = 31.89;
				 break;
			 case "crespo":
				 System.out.println("recomendamos o produto D");
				 preco = 27.80;
				 break;
				default:
					System.out.println("desculpe mas infelizmente não temos produtos para esse tipo de cabelo");	
			}
			if(preco > 0.0) {
				System.out.println("quantas unidades vc deseja: ");
				quantidade = entrada.nextInt();
				System.out.println("-----------------------------");
				double subtotal = preco * quantidade;
				total += subtotal;
			 }
			System.out.println("deseja continuar comprando");
	      }else if(pedido.equalsIgnoreCase("2")) {
	    	  System.out.println("informe o perfurme dentro do nosso catalago");
	    	  System.out.println("-----------------------------");
	    	  System.out.println("1 - oboticario");
	    	  System.out.println("2 - natura");
	    	  System.out.println("3 - dove");
	    	  String perfume = entrada.nextLine().toLowerCase();
	    	  switch(perfume) {
	    	  case "1" :
	    		  preco = 58.90;
	    		  System.out.println("valor: " + preco);
	    		  break;
	    	  case "2" :
	    		  preco = 63.45;
	    		  System.out.println("valor: " + preco);
	    		  break;
	    	  case "3" :
	    		  preco = 57.95;
	    		  System.out.println("valor : " + preco);
	    		  break;
	    	 default:
	    		 System.out.println("opção inválida");
	    	  }
	    	  if(preco > 0.0) {
					System.out.println("quantas unidades vc deseja: ");
					quantidade = entrada.nextInt();
					System.out.println("-----------------------------");
					double subtotal = preco * quantidade;
					total += subtotal;
				 }
				System.out.println("deseja continuar comprando"); 
				
	      }else if(pedido.equalsIgnoreCase("3")) {
	    	  System.out.println("escolha o produto dentro do nosso catalogo");
	    	  System.out.println("-----------------------------");
	    	  System.out.println("1 - oboticario");
	    	  System.out.println("2 - natura");
	    	  System.out.println("3 - dove");
	    	  String creme = entrada.nextLine().toLowerCase();
	    	  switch(creme) {
	    	  case "1" :
	    		  preco = 78.90;
	    		  System.out.println("valor: " + preco);
	    		  break;
	    	  case "2" :
	    		  preco = 83.75;
	    		  System.out.println("valor: " + preco);
	    		  break;
	    	  case "3" :
	    		  preco = 97.15;
	    		  System.out.println("valor : " + preco);
	    		  break;
	    	 default:
	    		 System.out.println("opção inválida");
	    	  }
	    	  if(preco > 0.0) {
					System.out.println("quantas unidades vc deseja: ");
					quantidade = entrada.nextInt();
					System.out.println("-----------------------------");
					double subtotal = preco * quantidade;
					total += subtotal;
	    	  }
	      }
			
		}while (!pedido.equals("pf"));
			System.out.println("obrigado pela compra R$ " + total);
		String formapagamento;
		formapagamento = entrada.nextLine().toLowerCase();
			if(formapagamento.equals("dinheiro")) {
				System.out.println("pagamento efetuado");
			}else if(formapagamento.equals("cartão")) {
				System.out.println("pagamento efetuado");
			}else {
				System.out.println("forma de pagamento inválida");
			}
		System.out.println("obrigado por comprar na nossa loja volte sempre");
		
		
		
		
		
		
		
		
	}

}
