import java.util.ArrayList;

public class GerenciadorMusicos {

    ArrayList<Musico> array;
    boolean encontrou = false;

    public GerenciadorMusicos(){
        array =  new ArrayList<>();
    }

    public void cadastrar(String nome, String instrumento, int nivel, int quantidadeShow){
        Musico m = new Musico(nome,instrumento,nivel,quantidadeShow);
        array.add(m);
        System.out.println("Cadastrado com sucesso!");
    }

    public void listar(){
        System.out.println("Lista de Musicos:");
        for(Musico m : array){
            System.out.println(m.nome);
            System.out.println(m.instrumento);
            System.out.println(m.nivel);
            System.out.println(m.quantidadeShow);
        }
    }

    public void remover(int index){
        array.remove(index);
        System.out.println("Removido");
    }

    public void atualizar(int index, int quantidadeShow){
        Musico m = array.get(index);
        m.quantidadeShow = quantidadeShow;
        array.set(index, m);
        System.out.println("Atualizado");

    }

    public void buscar(String instrumento){
        for(Musico m : array){
            if(m.instrumento.equals(instrumento)){
                System.out.println(m.nome);
                System.out.println("Encontrado");
                encontrou = true;   //////eu amo meu amorzinhoooooooooooooooooooooooooooooooooooooooo
            } 
        }
        if(!encontrou){
                System.out.println("Nao encontrado");
        }
    }
}
