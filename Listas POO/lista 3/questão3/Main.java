import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\n=== Bem Vindo! Ao Inventário de Tesouros Perdidos ===");
            System.out.println("\nEscolha uma opcao abaixo:");
            System.out.println("[1] Registrar um novo tesouro");
            System.out.println("[2] Listar todos os tesouros");
            System.out.println("[3] Atualizar o valor estimado de um tesouro");
            System.out.println("[4] Remover tesouro");
            System.out.println("[5] Buscar tesouros por país de origem");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do tesouro: ");
                    String nome = scanner.nextLine();
                    System.out.print("País de origem: ");
                    String pais = scanner.nextLine();
                    System.out.print("Valor estimado: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Ano de descoberta: ");
                    int ano = scanner.nextInt();

                    inventario.adicionarTesouro(new Tesouro(nome, pais, valor, ano));
                }
                case 2 -> inventario.listarTesouros();
                case 3 -> {
                    System.out.print("Nome do tesouro para atualizar o valor: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Novo valor estimado: ");
                    double novoValor = scanner.nextDouble();

                    inventario.atualizarValorTesouro(nomeAtualizar, novoValor);
                }
                case 4 -> {
                    System.out.print("Nome do tesouro a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    inventario.removerTesouro(nomeRemover);
                }
                case 5 -> {
                    System.out.print("Digite o país de origem: ");
                    String paisBuscar = scanner.nextLine();
                    inventario.buscarPorPais(paisBuscar);
                }
                case 6 -> {
                    System.out.println("voce saiu do Inventário de Tesouros Perdidos");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

