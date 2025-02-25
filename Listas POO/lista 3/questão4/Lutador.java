public class Lutador {
    private final String nome;
    private final String especie;
    private int vitorias;
    private final String poderEspecial;

    public Lutador(String nome, String especie, int vitorias, String poderEspecial) {
        this.nome = nome;
        this.especie = especie;
        this.vitorias = vitorias;
        this.poderEspecial = poderEspecial;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void adicionarVitoria() {
        this.vitorias++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Espécie: " + especie +
               " | Vitórias: " + vitorias + " | Poder Especial: " + poderEspecial;
    }
}