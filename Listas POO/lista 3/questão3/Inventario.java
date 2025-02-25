import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Tesouro> tesouros = new ArrayList<>();

    public void adicionarTesouro(Tesouro tesouro) {
        tesouros.add(tesouro);
        System.out.println("Tesouro registrado com sucesso!");
    }

    public void listarTesouros() {
        if (tesouros.isEmpty()) {
            System.out.println("Nenhum tesouro registrado.");
        } else {
            for (Tesouro t : tesouros) {
                System.out.println(t);
            }
        }
    }

    public void atualizarValorTesouro(String nome, double novoValor) {
        for (Tesouro t : tesouros) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                t.setValorEstimado(novoValor);
                System.out.println("Valor atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Tesouro não encontrado.");
    }

    public void removerTesouro(String nome) {
        if (tesouros.removeIf(t -> t.getNome().equalsIgnoreCase(nome))) {
            System.out.println("Tesouro removido com sucesso!");
        } else {
            System.out.println("Tesouro não encontrado.");
        }
    }

    public void buscarPorPais(String pais) {
        boolean encontrado = false;
        for (Tesouro t : tesouros) {
            if (t.getPaisOrigem().equalsIgnoreCase(pais)) {
                System.out.println(t);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum tesouro encontrado desse país.");
        }
    }

    public List<Tesouro> getTesouros() {
        return tesouros;
    }
}
