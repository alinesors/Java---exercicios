package lista 2.questão 3;

public class Animal {
    String nome;
    String dieta; 
    int energia;

    public Animal(String nome, String dieta) {
        this.nome = nome;
        this.dieta = dieta;
        this.energia = 100; 
    }

    void comerPlanta(Planta planta) {
        if (this.dieta.equals("Carnivoro")) {
            System.out.println(this.nome + ": Nao como plantas!");
            return;
        }
        this.energia += planta.valorEnergetico;
        planta.valorEnergetico = 0; 
    }

    void passarTempo(int horas) {
        this.energia -= horas * 10; 
        if (this.energia <= 0) {
            System.out.println(this.nome + ": Minha energia esta muito baixa! Preciso comer!");
        }
    }
}