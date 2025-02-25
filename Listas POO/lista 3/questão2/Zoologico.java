import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private final List<Criatura> criaturas = new ArrayList<>();

    public void adicionarCriatura(Criatura criatura) {
        criaturas.add(criatura);
        System.out.println("Criatura adicionada com sucesso!");
    }

    public void listarCriaturas() {
        if (criaturas.isEmpty()) {
            System.out.println("Nenhuma criatura registrada.");
        } else {
            for (Criatura c : criaturas) {
                System.out.println(c);
            }
        }
    }

    public void atualizarCriatura(String nome, String novaEspecie, int novoNivel, String novoHabitat) {
        for (Criatura c : criaturas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setEspecieHibrida(novaEspecie);
                c.setNivelAgressividade(novoNivel);
                c.setHabitat(novoHabitat);
                System.out.println("Criatura foi atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Criatura não foi encontrada.");
    }

    public void removerCriatura(String nome) {
        if (criaturas.removeIf(c -> c.getNome().equalsIgnoreCase(nome))) {
            System.out.println("Criatura foi removida com sucesso!");
        } else {
            System.out.println("Criatura não foi encontrada.");
        }
    }

    public void buscarPorHabitat(String habitat) {
        boolean encontrada = false;
        for (Criatura c : criaturas) {
            if (c.getHabitat().equalsIgnoreCase(habitat)) {
                System.out.println(c);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma criatura foi encontrada nesse habitat. Tente novamente");
        }
    }
}
