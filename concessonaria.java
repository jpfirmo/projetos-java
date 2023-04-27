import java.util.Scanner;

public class concessonaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("bem vindo(a) a concessonaria luxormotorsport.");
		String carro;
		String pedido;
		String moto;
		int formapagamento;
		double preco = 0.0;
		double total = 0.0;
		do {
			System.out.println("escolha uma categoria de veiculo ou 'finalizar' para encerrar o pedido. ");
			System.out.println("---------------------------");
			System.out.println("1- carros ");
			System.out.println("2- motos");
			pedido = entrada.nextLine().toLowerCase();
			if(pedido.equalsIgnoreCase("carros")) {
				System.out.println("informe o modelo do carro de acordo com o nosso catalogo: ");
				System.out.println("---------------------------");
				System.out.println("1 - ford");
				System.out.println("2 - ferrari");
				System.out.println("3 - lamborguini");
				System.out.println("4 - corvette");
				System.out.println("5 - nissan");
				carro = entrada.nextLine().toLowerCase();
				switch(carro) {
				case "1":
					preco = 256700;
					System.out.println("valor do ford R$ " + preco);
					break;
				case "2":
					preco = 2150000;
					System.out.println("valor da ferrari R$ " + preco);
					break;
				case "3":
					preco = 3100000;
					System.out.println("valor da lamborguini R$ " + preco);
					break;
				case "4":
					preco = 1350000;
					System.out.println("valor do corvette R$ " + preco);
					break;
				case "5":
					preco = 1250000;
					System.out.println("valor da lanborguini R$ " + preco);
					break;
				default:
					System.out.println("modelo de carro indisponível");
				}
				if(preco > 0.0) {
					System.out.println("quantas unidades desse veículo vc deseja");
					int quantidade = entrada.nextInt();
					double subtotal = preco * quantidade;
					total += subtotal;
					System.out.println("valor da compra R$" + total);
				}	
			}else if(pedido.equals("motos")) {
				System.out.println("escolha o modelo da moto dentro do nosso catalogo");
				System.out.println("---------------------------");
				System.out.println("1 - suzuki");
				System.out.println("2 - kavasaki");
				System.out.println("3 - yamaha");
				System.out.println("4 - pegassi");
				System.out.println("5 - dinka akuma");
				moto = entrada.nextLine().toLowerCase();
				switch(moto){
				case "1":
					preco = 250000;
					System.out.println("valor da suzuki R$ " + preco);
					break;
				case "2":
					preco = 300000;
					System.out.println("valor da kavasaki R$ " + preco);
					break;
				case "3":
					preco = 175000;
					System.out.println("valor da yamaha R$ " + preco);
					break;
				case "4":
					preco = 125000;
					System.out.println("valor da pegassi R$ " + preco);
					break;
				case "5":
					preco = 375000;
					System.out.println("valor da dinka akuma R$ " + preco);
					break;
				default:
					System.out.println("modelo de moto indisponivel");
				}
				if(preco > 0.0) {
					System.out.println("quantas unidades desse veículo vc deseja");
					int quantidade = entrada.nextInt();
					double subtotal = preco * quantidade;
					total += subtotal;
					System.out.println("valor da compra R$" + total);
				}
			}
		}while(!pedido.equalsIgnoreCase("finalizar"));
		System.out.println("valor da compra R$ " + total);
		System.out.println("escolha a forma de pagamento disponível");
		System.out.println("---------------------------");
		System.out.println("1 - dinheiro");
		System.out.println("2 - cartão crédito");
		System.out.println("3 - cartão débito");
		formapagamento = entrada.nextInt();
		System.out.println("pagamento aprovado ");
		System.out.println("---------------------------");
		System.out.println("obrigado pela preferência,volte sempre!");
	}
}
