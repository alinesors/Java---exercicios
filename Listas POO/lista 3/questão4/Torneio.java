public class Torneio {
    private final Lutador[] lutadores;
    private int quantidade;

    public Torneio(int capacidade) {
        this.lutadores = new Lutador[capacidade];
        this.quantidade = 0;
    }

    public void cadastrarLutador(Lutador lutador) {
        if (quantidade < lutadores.length) {
            lutadores[quantidade] = lutador;
            quantidade++;
            System.out.println("Lutador foi cadastrado com sucesso!");
        } else {
            System.out.println("Torneio cheio! Não é possível cadastrar mais lutadores.");
        }
    }

    public void listarLutadores() {
        if (quantidade == 0) {
            System.out.println("Nenhum lutador foi cadastrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(lutadores[i]);
            }
        }
    }

    public void atualizarVitorias(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (lutadores[i].getNome().equalsIgnoreCase(nome)) {
                lutadores[i].adicionarVitoria();
                System.out.println("Vitória adicionada ao lutador " + nome);
                return;
            }
        }
        System.out.println("Lutador não encontrado.");
    }

    public void removerLutador(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (lutadores[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < quantidade - 1; j++) {
                    lutadores[j] = lutadores[j + 1];
                }
                lutadores[quantidade - 1] = null;
                quantidade--;
                System.out.println("Lutador " + nome + " removido.");
                return;
            }
        }
        System.out.println("Lutador não foi encontrado.");
    }

    public void buscarPorEspecie(String especie) {
        boolean encontrado = false;
        for (int i = 0; i < quantidade; i++) {
            if (lutadores[i].getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(lutadores[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum lutador foi encontrado dessa espécie.");
        }
    }
}
