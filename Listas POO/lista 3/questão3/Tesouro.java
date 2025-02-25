public class Tesouro {
    private String nome;
    private final String paisOrigem;
    private double valorEstimado;
    private final int anoDescoberta;

    public Tesouro(String nome, String paisOrigem, double valorEstimado, int anoDescoberta) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.valorEstimado = valorEstimado;
        this.anoDescoberta = anoDescoberta;
    }

    public Tesouro(int anoDescoberta, String paisOrigem) {
        this.anoDescoberta = anoDescoberta;
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | País de Origem: " + paisOrigem + 
               " | Valor Estimado: $" + valorEstimado + " | Ano de Descoberta: " + anoDescoberta;
    }
}
