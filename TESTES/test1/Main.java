import java.util.Scanner;
import test1.Armazenar;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int op;
        Armazenar clauline = new Armazenar();

        do { 
            System.out.println("Digite a opcao:");
            System.out.println("1 - registrar");
            System.out.println("2 - listar");
            System.out.println("3 - remover");
            System.out.println("4 - buscar");
            System.out.println("5 - atualizar");
            System.out.println("0 - sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                String nome;
                String pais;
                double valor;
                int ano;

                sc.nextLine();
                nome = sc.nextLine();
                
                pais = sc.nextLine();
                
                valor = sc.nextDouble();
                ano = sc.nextInt();
                clauline.Registrar(nome, pais, valor, ano);
                break;

                case 2: 
                clauline.Listar();
                break;

                case 3: 
                int index;
                index = sc.nextInt();
                clauline.Remover(index);
                break;

                case 4: 
                sc.nextLine();
                pais = sc.nextLine();
                clauline.Buscar(pais);
                break;

                case 5: 
                index = sc.nextInt();
                valor = sc.nextDouble();
                clauline.Atualizar(index, valor);
                break;
            }
        } while (op != 0);
    }    
}
