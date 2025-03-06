
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Gerenciador g = new Gerenciador();

        do{
            System.out.println("----------------------");
            System.out.println("Clube do Livro");
            System.out.println("Escolha a opcao:");
            System.out.println("1 - Cadastar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");
            op = sc.nextInt();
        } while(op != 0);
            switch(op){
                case 1:
                    System.out.println("Digite o titulo do livro:");
                    String titulo = sc.next();
                    System.out.println("Digite o autor do livro:");
                    String autor = sc.next();
                    System.out.println("Digite o numero de paginas do livro:");
                    int numeroPaginas = sc.nextInt();
                    System.out.println("Digite o status do livro:");
                    String status = sc.next();
                    g.cadastrar(titulo, autor, numeroPaginas, status);
                    break;
                case 2:
                    g.listar();
                    break;
                case 3:
                    System.out.println("Digite o status do livro:");
                    String statusBusca = sc.next();
                    g.buscar(statusBusca);
                    break;
                case 4:
                    System.out.println("Digite o status do livro:");
                    String statusAtualiza = sc.next();
                    System.out.println("Digite o index do livro:");
                    int index = sc.nextInt();
                    g.atualizar(statusAtualiza, index);
                    break;
                case 5:
                    System.out.println("Digite o index do livro:");
                    int indexRemove = sc.nextInt();
                    g.remover(indexRemove);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            sc.close();
        }
    }
