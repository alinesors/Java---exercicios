package lista 2.questão 2;

public class ObraDeArte {
    private String titulo;
    private int anoDeCriacao;
    private double valorEstimado;

    public ObraDeArte(String titulo, int anoDeCriacao, double valorEstimado) {
        this.titulo = titulo;
        this.anoDeCriacao = anoDeCriacao;
        this.valorEstimado = valorEstimado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Ano: " + anoDeCriacao + ", Valor Estimado: R$" + valorEstimado;
    }
}

