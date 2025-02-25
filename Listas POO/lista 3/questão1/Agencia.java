import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private final List<Agente> agentes;

    public Agencia() {
        this.agentes = new ArrayList<>();
    }

    public void cadastrarAgente(Agente agente) {
        agentes.add(agente);
        System.out.println("Agente cadastrado com sucesso!");
    }

    public void listarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("Nenhum agente cadastrado.");
        } else {
            System.out.println("=== Lista de Agentes ===");
            for (Agente agente : agentes) {
                System.out.println(agente);
            }
        }
    }

    public Agente buscarPorCodinome(String codinome) {
        for (Agente agente : agentes) {
            if (agente.getCodinome().equalsIgnoreCase(codinome)) {
                return agente;
            }
        }
        return null;
    }

    public boolean atualizarAgente(String codinome, String novaEspecialidade, int novoNivelPerigo) {
        Agente agente = buscarPorCodinome(codinome);
        if (agente != null) {
            agente.setEspecialidade(novaEspecialidade);
            agente.setNivelPerigo(novoNivelPerigo);
            System.out.println("Agente atualizado com sucesso!");
            return true;
        } else {
            System.out.println("Agente não encontrado.");
            return false;
        }
    }

    public boolean removerAgente(String codinome) {
        Agente agente = buscarPorCodinome(codinome);
        if (agente != null) {
            agentes.remove(agente);
            System.out.println("Agente removido com sucesso!");
            return true;
        } else {
            System.out.println("Agente não encontrado.");
            return false;
        }
    }
}
