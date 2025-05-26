import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();
		banco.setContas(new ArrayList<>());

		while (true) {
			System.out.println("\n==== MENU BANCO ====");
			System.out.println("1. Criar Conta Corrente");
			System.out.println("2. Criar Conta Poupança");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Transferir");
			System.out.println("6. Ver Extrato");
			System.out.println("7. Listar Clientes");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
				case 2:
					System.out.print("Nome do cliente: ");
					String nomeCliente = scanner.nextLine();
					Cliente cliente = new Cliente();
					cliente.setNome(nomeCliente);
					Conta novaConta = (opcao == 1)
						? new ContaCorrente(cliente)
						: new ContaPoupanca(cliente);
					banco.getContas().add(novaConta);
					System.out.println("Conta criada! Número: " + novaConta.getNumero());
					break;

				case 3:
					System.out.print("Número da conta: ");
					int numeroDeposito = scanner.nextInt();
					System.out.print("Valor do depósito: ");
					double valorDep = scanner.nextDouble();
					Conta contaDep = encontrarContaPorNumero(banco, numeroDeposito);
					if (contaDep != null) {
						contaDep.depositar(valorDep);
						System.out.println("Depósito realizado!");
					} else {
						System.out.println("Conta não encontrada.");
					}
					break;

				case 4:
					System.out.print("Número da conta: ");
					int numeroSaque = scanner.nextInt();
					System.out.print("Valor do saque: ");
					double valorSaq = scanner.nextDouble();
					Conta contaSaq = encontrarContaPorNumero(banco, numeroSaque);
					if (contaSaq != null) {
						if (contaSaq.getSaldo() >= valorSaq) {
							contaSaq.sacar(valorSaq);
							System.out.println("Saque realizado!");
						} else {
							System.out.println("Saldo insuficiente.");
						}
					} else {
						System.out.println("Conta não encontrada.");
					}
					break;

				case 5:
					System.out.print("Conta origem: ");
					int origem = scanner.nextInt();
					System.out.print("Conta destino: ");
					int destino = scanner.nextInt();
					System.out.print("Valor: ");
					double valorTransf = scanner.nextDouble();

					Conta contaOrigem = encontrarContaPorNumero(banco, origem);
					Conta contaDestino = encontrarContaPorNumero(banco, destino);

					if (contaOrigem != null && contaDestino != null) {
						if (contaOrigem.getSaldo() >= valorTransf) {
							contaOrigem.transferir(valorTransf, contaDestino);
							System.out.println("Transferência realizada!");
						} else {
							System.out.println("Saldo insuficiente.");
						}
					} else {
						System.out.println("Conta(s) não encontrada(s).");
					}
					break;

				case 6:
					System.out.print("Número da conta: ");
					int numeroExtrato = scanner.nextInt();
					Conta contaExt = encontrarContaPorNumero(banco, numeroExtrato);
					if (contaExt != null) {
						contaExt.imprimirExtrato();
					} else {
						System.out.println("Conta não encontrada.");
					}
					break;

				case 7:
					List<String> nomes = banco.getNomesClientes();
					if (nomes.isEmpty()) {
						System.out.println("Nenhum cliente cadastrado.");
					} else {
						System.out.println("Clientes:");
						nomes.forEach(System.out::println);
					}
					break;

				case 0:
					System.out.println("Saindo...");
					scanner.close();
					return;

				default:
					System.out.println("Opção inválida!");
			}
		}
	}

	private static Conta encontrarContaPorNumero(Banco banco, int numero) {
		for (Conta conta : banco.getContas()) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
}
