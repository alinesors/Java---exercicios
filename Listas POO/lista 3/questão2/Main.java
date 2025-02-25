import java.util.Scanner;
//Questão 2 - lista 3

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();

        while (true) {
            System.out.println("\n=== Bem Vindo! Ao Zoológico Genético Futurista ===");
            System.out.println("\nEscolha uma opcao abaixo:");
            System.out.println("[1] Adicionar uma nova criatura");
            System.out.println("[2] Listar");
            System.out.println("[3] Atualizar a criatura");
            System.out.println("[4] Remover a criatura");
            System.out.println("[5] Buscar criatura por habitat");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome da criatura: ");
                    String nome = scanner.nextLine();
                    System.out.print("Espécie híbrida: ");
                    String especie = scanner.nextLine();
                    System.out.print("Nível de agressividade (de 1 a 10): ");
                    int nivel = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Habitat (opcao: terra, ar, mar): ");
                    String habitat = scanner.nextLine();

                    zoologico.adicionarCriatura(new Criatura(nome, especie, nivel, habitat));
                }
                case 2 -> zoologico.listarCriaturas();
                case 3 -> {
                    System.out.print("Nome da criatura a ser atualizada: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova espécie híbrida: ");
                    String novaEspecie = scanner.nextLine();
                    System.out.print("Novo nível de agressividade (1 a 10): ");
                    int novoNivel = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo habitat: ");
                    String novoHabitat = scanner.nextLine();

                    zoologico.atualizarCriatura(nomeAtualizar, novaEspecie, novoNivel, novoHabitat);
                }
                case 4 -> {
                    System.out.print("Nome da criatura a ser removida: ");
                    String nomeRemover = scanner.nextLine();
                    zoologico.removerCriatura(nomeRemover);
                }
                case 5 -> {
                    System.out.print("Digite o habitat (terra, ar, mar): ");
                    String habitatBuscar = scanner.nextLine();
                    zoologico.buscarPorHabitat(habitatBuscar);
                }
                case 6 -> {
                    System.out.println("Saindo do Zoológico Genético Futurista.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
