package test4;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int op;

        // cria objeto
        Gerenciador gerenciador = new Gerenciador();

        do {
            System.out.println("Digite a opcao:");
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
                    String autor;
                    String tipo;
                    String status;
                    int ano;

                    sc.nextLine();
                    System.out.println("nome: ");
                    nome = sc.nextLine();
                    System.out.println("autor: ");
                    autor = sc.nextLine();
                    System.out.println("tipo: ");
                    tipo = sc.nextLine();
                    System.out.println("status: ");
                    status = sc.nextLine();
                    System.out.println("ano: ");
                    ano = sc.nextInt();

                    gerenciador.cadastrar(nome, autor, tipo, status, ano);
                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                    gerenciador.remover(nome);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                    System.out.println("Status de Leitura: ");
                    status = sc.nextLine();
                    gerenciador.atualizar(nome, status);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                    gerenciador.busca(nome);
                    break;

                case 0:
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
