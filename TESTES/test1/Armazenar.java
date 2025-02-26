package test1;
import java.util.ArrayList;

public class Armazenar {
      // array da classe tesouro, atributos globais
    ArrayList<Tesouro> array;

    public Armazenar(){
        array = new ArrayList<>();
    }

    public void Registrar(String nome, String pais, double valor, int ano){
        Tesouro t = new Tesouro(nome, pais, valor, ano);
        array.add(t);
    }

    public void Listar(){
        for(Tesouro t : array){
            System.out.println(t.nome);
            System.out.println(t.pais);
            System.out.println(t.valor);
            System.out.println(t.ano);
        }
    }

    public void Remover(int index){
        array.remove(index);
    }

    public void Buscar(String pais){
        for(Tesouro t : array){
            if(t.pais.equals(pais)){
                System.out.println(t.nome);
                System.out.println(t.pais);
                System.out.println(t.valor);
                System.out.println(t.ano);
            }
        }
    }

    public void Atualizar(int index, double valor){
        Tesouro t = array.get(index);
        t.valor = valor;
        array.set(index, t);
    }
}