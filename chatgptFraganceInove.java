import java.util.Scanner;

public class chatgptFraganceInove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				        Scanner scanner = new Scanner(System.in);
		        System.out.println("Bem-vinda à Frangance Ivone");

		        String confirmacao;
		        String pedido;
		        double preco = 0.0;
		        double total = 0.0;
		        int quantidade;

		        do {
		            System.out.println("Informe o tipo de kit de tratamento capilar ou 'pf' para finalizar o pedido");
		            System.out.println("-------------------------------------");
		            System.out.println("1 - Kit de tratamento para cabelos lisos");
		            System.out.println("2 - Kit de tratamento para cabelos ondulados");
		            System.out.println("3 - Kit de tratamento para cabelos cacheados");
		            System.out.println("4 - Kit de tratamento para cabelos crespos");
		            System.out.println("5 - Kit de tratamento para cabelos químicos+loiros");
		            pedido = scanner.nextLine().toLowerCase();

		            if (pedido.equals("1")) {
		                System.out.println("Você escolheu o kit de tratamento para cabelos lisos");
		                preco = 45.00;
		            } else if (pedido.equals("2")) {
		                System.out.println("Você escolheu o kit de tratamento para cabelos ondulados");
		                preco = 45.00;
		            } else if (pedido.equals("3")) {
		                System.out.println("Você escolheu o kit de tratamento para cabelos cacheados");
		                preco = 45.00;
		            } else if (pedido.equals("4")) {
		                System.out.println("Você escolheu o kit de tratamento para cabelos crespos");
		                preco = 45.00;
		            } else if (pedido.equals("5")) {
		                System.out.println("Você escolheu o kit de tratamento para cabelos químicos+loiros");
		                preco = 45.00;
		            } else if (pedido.equals("pf")) {
		                break; // Sai do loop ao finalizar o pedido
		            } else {
		                System.out.println("Kit de tratamento inválido");
		                continue; // Reinicia o loop para solicitar outro pedido
		            }

		            System.out.println("Quantas unidades você deseja: ");
		            quantidade = scanner.nextInt();
		            scanner.nextLine(); // Consumir a quebra de linha pendente
		            System.out.println("-----------------------------");
		            double subtotal = preco * quantidade;
		            total += subtotal;

		        } while (!pedido.equals("pf"));

		        System.out.println("Sua compra deu um total de R$: " + total);
		        System.out.println("-----------------------------");

		        System.out.println("Selecione a forma de pagamento:");
		        System.out.println("1 - Dinheiro");
		        System.out.println("2 - Pix");
		        System.out.println("3 - Cartão");

		        int formaPagamento = scanner.nextInt();
		        scanner.nextLine(); // Consumir a quebra de linha pendente

		        String formaPagamentoTexto = "";
		        switch (formaPagamento) {
		            case 1:
		                formaPagamentoTexto = "d1inheiro";
		                break;
		            case 2:
		                formaPagamentoTexto = "pix";
		                break;
		            case 3:
		                formaPagamentoTexto = "cartão";
		                System.out.println("Deseja parcelar em quantas vezes (até 3 vezes)?");
		                int parcelas = scanner.nextInt();
		                scanner.nextLine(); // Consumir a quebra de linha pendente

		                if (parcelas <= 0 || parcelas > 3) {
		                    System.out.println("Número de parcelas inválido. Será considerado pagamento à vista.");
		                    parcelas = 1;
		                }

		                double valorParcela = total / parcelas;
		                System.out.println("Pagamento parcelado em " + parcelas + " vezes.");
		                System.out.println("Valor da parcela: R$ " + valorParcela);
		                break;
		            default:
		                System.out.println("Opção de pagamento inválida. Será considerado pagamento à vista.");
		        }

		        System.out.println("Deseja confirmar a compra?");
		        confirmacao = scanner.nextLine().toLowerCase();

		        if (confirmacao.equals("sim")) {
		            System.out.println("-----------------------------");
		            System.out.println("NOTA FISCAL");
		            System.out.println("-----------------------------");
		            System.out.println("Itens comprados:");
		            System.out.println("-----------------------------");
		            // Mostrar os itens do pedido
		            System.out.println("Forma de pagamento: " + formaPagamentoTexto);
		            if (formaPagamento == 3) {
		                String parcelas = null;
						System.out.println("Quantidade de parcelas: " + parcelas);
		                String valorParcela = null;
						System.out.println("Valor da parcela: R$ " + valorParcela);
		            }
		            System.out.println("-----------------------------");
		            System.out.println("Total: R$ " + total);
		            System.out.println("-----------------------------");
		            System.out.println("Obrigada pela compra!");
		        } else {
		            System.out.println("Compra cancelada.");
		        }
		    }
		

	}


