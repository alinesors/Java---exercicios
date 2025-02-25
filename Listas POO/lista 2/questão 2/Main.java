package lista 2.questão 2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Artista[] artistas = new Artista[5]; 
        int qtdArtistas = 0;

        int op;

        do {
            System.out.println("BEM VINDO A GALERIA DE ARTE VIRTUAL");
            System.out.println("1 - Adicionar um artista");
            System.out.println("2 - Adicionar uma obra de arte a um artista");
            System.out.println("3 - Listar obras de um artista");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha a acao que deseja realizar: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (qtdArtistas < artistas.length) {
                        System.out.print("Nome do artista: ");
                        String nome = sc.next();
                        System.out.print("Pais de origem: ");
                        String pais = sc.next();
                        System.out.println("Capacidade maxima de obras: ");
                        int capacidade = sc.nextInt();

                        artistas[qtdArtistas] = new Artista(nome, pais, capacidade);
                        qtdArtistas++;
                        System.out.println("Artista adicionado com sucesso!");
                    } else {
                        System.out.println("Numero maximo de artistas alcançado!");
                    }
                    break;

                case 2:
                    if (qtdArtistas > 0) {
                        System.out.println("Escolha um artista:");
                        for (int i = 0; i < qtdArtistas; i++) {
                            System.out.println(i + " - " + artistas[i].getNome());
                        }
                        int artistaIdx = sc.nextInt();

                        if (artistaIdx >= 0 && artistaIdx < qtdArtistas) {
                            System.out.print("Titulo da obra: ");
                            String titulo = sc.next();
                            System.out.print("Ano de criacao da obra: ");
                            int ano = sc.nextInt();
                            System.out.println("Valor estimado da obra: ");
                            double valor = sc.nextDouble();

                            ObraDeArte obra = new ObraDeArte(titulo, ano, valor);
                            artistas[artistaIdx].adicionarObra(obra);
                        } else {
                            System.out.println("Artista invalido!");
                        }
                    } else {
                        System.out.println("Nenhum artista cadastrado!");
                    }
                    break;

                case 3:
                    if (qtdArtistas > 0) {
                        System.out.println("Escolha um artista:");
                        for (int i = 0; i < qtdArtistas; i++) {
                            System.out.println(i + " - " + artistas[i].getNome());
                        }
                        int artistaIdx = sc.nextInt();

                        if (artistaIdx >= 0 && artistaIdx < qtdArtistas) {
                            artistas[artistaIdx].listarObras();
                        } else {
                            System.out.println("Artista invalido!");
                        }
                    } else {
                        System.out.println("Nenhum artista cadastrado!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}