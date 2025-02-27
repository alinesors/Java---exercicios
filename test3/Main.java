
import java.util.Scanner;

public class Main {
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
                    sc.nextLine();
                    tipo = sc.nextLine();
                    nome = sc.nextLine();
                    ano = sc.nextInt();
                    gerenciador.buscar(tipo, nome, ano);
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
