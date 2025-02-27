package test2;
public class Musico {

    //cria atributos
    String nome;
    String instrumento;
    int nivel;
    int quantidadeShow;

    //cria construtor
    public Musico(String nome, String instrumento, int nivel, int quantidadeShow) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.nivel = nivel;
        this.quantidadeShow = quantidadeShow;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getQuantidadeShow() {
        return quantidadeShow;
    }

    public void setQuantidadeShow(int quantidadeShow) {
        this.quantidadeShow = quantidadeShow;
    }
}