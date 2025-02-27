
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Scanner sc =  new Scanner(System.in);
    int op;

    GerenciadorMusicos gm = new GerenciadorMusicos(); //cria objeto da classe

    do { 
        System.out.println("Digite a opcao:");
        System.out.println("1 - cadastrar");
        System.out.println("2 - listar");
        System.out.println("3 - remover");
        System.out.println("4 - buscar");
        System.out.println("5 - atualizar");
        System.out.println("0 - sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("digite o nome, instrumento, nivel e quantidade de show");
                String nome;
                String instrumento;
                int nivel;
                int quantidadeShow;

                sc.nextLine();
                nome = sc.nextLine();
                instrumento = sc.nextLine();
                nivel = sc.nextInt();
                quantidadeShow = sc.nextInt();
                sc.nextLine();
                gm.cadastrar(nome, instrumento, nivel, quantidadeShow);
                break;

                case 2:
                sc.nextLine();
                gm.listar();
                break;

                case 3:
                System.out.println("digite o index");
                sc.nextLine();
                int index;
                index = sc.nextInt();
                gm.remover(index);
                break;

                case 4: 
                System.out.println("digite o instrumento");
                sc.nextLine();
                instrumento = sc.nextLine();
                gm.buscar(instrumento);
                break;

                case 5:
                System.out.println("digite a qqtd de show");
                sc.nextLine();
                quantidadeShow = sc.nextInt();
                gm.atualizar(quantidadeShow);
                break;

                case 0:
                break;
            }
        } while (op != 0);
    }
}