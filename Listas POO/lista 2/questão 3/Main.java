package lista 2.questão 3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Planta> plantas = new ArrayList<>();

        int op;

        do {
            System.out.println("BEM VINDO AO ECOSSISTEMA VIRTUAL!\n");
            System.out.println("1 - Criar um animal");
            System.out.println("2 - Criar uma planta");
            System.out.println("3 - Fazer um animal comer");
            System.out.println("4 - Passar tempo");
            System.out.println("5 - Mostrar todos os animais");
            System.out.println("6 - Mostrar todas as plantas");
            System.out.println("0 - Encerrar o programa");
            System.out.print("\nEscolha a acao que deseja realizar: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nomeAnimal = sc.next();
                    System.out.print("Digite qual a dieta do animal (herbivoro, Carnivoro, onivoro): ");
                    String dieta = sc.next();
                    Animal animal = new Animal(nomeAnimal, dieta);
                    animais.add(animal);
                    System.out.println("Animal criado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome da planta: ");
                    String nomePlanta = sc.next();
                    System.out.print("Digite qual o valor energetico da planta: ");
                    int valorEnergetico = sc.nextInt();
                    Planta planta = new Planta(nomePlanta, valorEnergetico);
                    plantas.add(planta);
                    System.out.println("Planta criada com sucesso!");
                    break;

                case 3:
                    if (animais.isEmpty() || plantas.isEmpty()) {
                        System.out.println("Voce precisa de animais e plantas no ecossistema!");
                        break;
                    }
                    System.out.println("Escolha um animal para comer:");
                    for (int i = 0; i < animais.size(); i++) {
                        Animal a = animais.get(i);
                        System.out.println(i + " - Nome: " + a.nome + ", Energia: " + a.energia);
                    }
                    int animalIdx = sc.nextInt();

                    System.out.println("Escolha uma planta para comer:");
                    for (int i = 0; i < plantas.size(); i++) {
                        Planta p = plantas.get(i);
                        System.out.println(i + " - Nome: " + p.nome + ", Energia: " + p.valorEnergetico);
                    }
                    int plantaIdx = sc.nextInt();

                    Animal a = animais.get(animalIdx);
                    Planta p = plantas.get(plantaIdx);
                    a.comerPlanta(p);
                    System.out.println(a.nome + " comeu a planta " + p.nome + "!");
                    break;

                case 4:
                    System.out.print("Quantas horas se passaram?");
                    int horas = sc.nextInt();
                    for (Animal anim : animais) {
                        anim.passarTempo(horas);
                    }
                    System.out.println("O tempo passou...");
                    break;

                case 5:
                    System.out.println("Lista de Animais criados:");
                    for (Animal anim : animais) {
                        System.out.println("Nome: " + anim.nome + ", Dieta: " + anim.dieta + ", Energia: " + anim.energia);
                    }
                    break;

                case 6:
                    System.out.println("Lista de Plantas criadas:");
                    for (Planta plant : plantas) {
                        System.out.println("Nome: " + plant.nome + ", Energia: " + plant.valorEnergetico);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}
