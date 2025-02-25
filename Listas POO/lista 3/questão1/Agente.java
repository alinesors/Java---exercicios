import java.util.Objects;


public class Agente {
    private String codinome;
    private String especialidade;
    private int nivelPerigo;

    public Agente(String codinome, String especialidade, int nivelPerigo) {
        this.codinome = codinome;
        this.especialidade = especialidade;
        this.nivelPerigo = nivelPerigo;
    }

    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNivelPerigo() {
        return nivelPerigo;
    }

    public void setNivelPerigo(int nivelPerigo) {
        this.nivelPerigo = nivelPerigo;
    }

    @Override
    public String toString() {
        return "Codinome: " + codinome + " | Especialidade: " + especialidade + " | Nível de Perigo: " + nivelPerigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Agente agente = (Agente) obj;
        return Objects.equals(codinome, agente.codinome);
    }

    @Override
        public int hashCode() {
        return Objects.hash(codinome);
    }
}