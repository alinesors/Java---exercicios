import java.util.Scanner; 
//Questão 4 - lista 3

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número max. de lutadores no torneio intergaláctico: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); 

        Torneio torneio = new Torneio(capacidade);

        while (true) {
            System.out.println("\n=== Bem-vindo ao Torneio Intergaláctico de Lutas ===");
            System.out.println("\nEscolha uma opção abaixo:");
            System.out.println("[1] Cadastrar novo lutador");
            System.out.println("[2] Listar todos os lutadores");
            System.out.println("[3] Atualizar número de vitórias de um lutador");
            System.out.println("[4] Remover lutador");
            System.out.println("[5] Buscar lutadores por espécie");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do lutador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Espécie: ");
                    String especie = scanner.nextLine();
                    System.out.print("Número de vitórias: ");
                    int vitorias = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Poder especial: ");
                    String poder = scanner.nextLine();

                    torneio.cadastrarLutador(new Lutador(nome, especie, vitorias, poder));
                }
                case 2 -> torneio.listarLutadores();
                case 3 -> {
                    System.out.print("Nome do lutador para adicionar vitória: ");
                    String nomeAtualizar = scanner.nextLine();
                    torneio.atualizarVitorias(nomeAtualizar);
                }
                case 4 -> {
                    System.out.print("Nome do lutador a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    torneio.removerLutador(nomeRemover);
                }
                case 5 -> {
                    System.out.print("Digite a espécie dos lutadores: ");
                    String especieBuscar = scanner.nextLine();
                    torneio.buscarPorEspecie(especieBuscar);
                }
                case 6 -> {
                    System.out.println("Saindo do Torneio Intergaláctico de Lutas");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente mais uma vez.");
            }
        }
    }
}