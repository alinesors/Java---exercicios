import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agencia agencia = new Agencia();

        while (true) {
            System.out.println("\n=== Agência Secreta de Espiões ===");
            System.out.println("\nEscolha uma opcao abaixo:");
            System.out.println("1. Cadastrar novo agente");
            System.out.println("2. Listar todos os agentes");
            System.out.println("3. Atualizar agente");
            System.out.println("4. Remover agente");
            System.out.println("5. Buscar agente por codinome");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o codinome do agente: ");
                    String codinome = scanner.nextLine();
                    System.out.print("Digite a especialidade do agente (infiltração, combate, inteligência, hacking): ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Digite o nível de perigo (1 a 10): ");
                    int nivelPerigo = scanner.nextInt();
                    scanner.nextLine(); 

                    agencia.cadastrarAgente(new Agente(codinome, especialidade, nivelPerigo));
                }
                case 2 -> agencia.listarAgentes();
                case 3 -> {
                    System.out.print("Digite o codinome do agente a ser atualizado: ");
                    String codAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova especialidade: ");
                    String novaEspecialidade = scanner.nextLine();
                    System.out.print("Digite o novo nível de perigo (1 a 10): ");
                    int novoNivel = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    agencia.atualizarAgente(codAtualizar, novaEspecialidade, novoNivel);
                }
                case 4 -> {
                    System.out.print("Digite o codinome do agente a ser removido: ");
                    String codRemover = scanner.nextLine();
                    agencia.removerAgente(codRemover);
                }
                case 5 -> {
                    System.out.print("Digite o codinome do agente a ser buscado: ");
                    String codBuscar = scanner.nextLine();
                    Agente agente = agencia.buscarPorCodinome(codBuscar);
                    if (agente != null) {
                        System.out.println("Agente encontrado: " + agente);
                    } else {
                        System.out.println("Agente não encontrado.");
                    }
                }
                case 6 -> {
                    System.out.println("Saindo da Agência Secreta de Espiões");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}