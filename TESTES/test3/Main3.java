package test3;
import java.util.Scanner;

public class Main3 {
   public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int op;
        Gerenciador gerenciador = new Gerenciador();

        do { 
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Buscar");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    String nome;
                    String tipo;
                    double nota;
                    int ano;

                    sc.nextLine();
                    nome = sc.nextLine();
                    tipo = sc.nextLine();
                    nota = sc.nextDouble();
                    ano = sc.nextInt();
                    gerenciador.cadastrar(nome, tipo, nota, ano);
                    break;

                case 2: 
                    gerenciador.listar();
                    break;

                case 3: 
                    int index;
                    index = sc.nextInt();
                    gerenciador.remover(index);
                    break;

                case 4: 
                    index = sc.nextInt();
                    nota = sc.nextDouble();
                    gerenciador.atualizar(index, nota);
                    break;

                case 5: 
                System.out.println("Buscar por:");
                System.out.println("1 - Ano");
                System.out.println("2 - Nome");
                System.out.println("3 - Tipo");
                int buscaOp = sc.nextInt();
                sc.nextLine(); // Consumir a nova linha

                switch (buscaOp) {
                    case 1:
                        System.out.println("Digite o ano:");
                        ano = sc.nextInt();
                        gerenciador.buscarPorAno(ano);
                        break;
                    case 2:
                        System.out.println("Digite o nome:");
                        nome = sc.nextLine();
                        gerenciador.buscarPorNome(nome);
                        break;
                    case 3:
                        System.out.println("Digite o tipo:");
                        tipo = sc.nextLine();
                        gerenciador.buscarPorTipo(tipo);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                break;
            }
        } while (op != 0);
        sc.close();
    }
}