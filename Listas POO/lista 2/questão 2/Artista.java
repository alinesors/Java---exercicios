package lista 2.questão 2;

public class Artista {
    private String nome;
    private String paisDeOrigem;
    private ObraDeArte[] obras; 
    private int qtdObras; 

    public Artista(String nome, String paisDeOrigem, int capacidadeObras) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
        this.obras = new ObraDeArte[capacidadeObras];
        this.qtdObras = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void adicionarObra(ObraDeArte obra) {
        if (qtdObras < obras.length) {
            obras[qtdObras] = obra;
            qtdObras++;
            System.out.println("A obra adicionada com sucesso!");
        } else {
            System.out.println("A capacidade maxima de obras atingida!");
        }
    }

    public void listarObras() {
        System.out.println("Obras de " + nome + ":");
        for (int i = 0; i < qtdObras; i++) {
            System.out.println("- " + obras[i]);
        }
    }
}
