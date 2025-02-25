public class Criatura {
    private final String nome;
    private String especieHibrida;
    private int nivelAgressividade;
    private String habitat;

    public Criatura(String nome, String especieHibrida, int nivelAgressividade, String habitat) {
        this.nome = nome;
        this.especieHibrida = especieHibrida;
        this.nivelAgressividade = nivelAgressividade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecieHibrida(String especieHibrida) {
        this.especieHibrida = especieHibrida;
    }

    public void setNivelAgressividade(int nivelAgressividade) {
        this.nivelAgressividade = nivelAgressividade;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Espécie Híbrida: " + especieHibrida + 
               " | Nível de Agressividade: " + nivelAgressividade + " | Habitat: " + habitat;
    }
}