

import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Midia> array;
    boolean encontrou = false;

    public Gerenciador(){
        array = new ArrayList<>();
    }

    public void cadastrar(String nome, String tipo, double nota, int ano){
        Midia m = new Midia(nome, tipo, nota, ano);
        array.add(m);
        System.out.println("encontrado");
    }

    public void listar(){
        System.out.println("Lista:");
        for(Midia m : array){
            System.out.println(m.nome);
            System.out.println(m.tipo);
            System.out.println(m.nota);
            System.out.println(m.ano);
        }
    }

    public void remover(int index){
        array.remove(index);
        System.out.println("Removido");
    }

    public void atualizar(int index, double  nota){
        Midia m = array.get(index);
        m.nota = nota;
        array.set(index, m);
        System.out.println("Atualizado");
    }

    public void buscar(String tipo, String nome, int ano){
        for(Midia m : array){
            if(m.tipo.equals(tipo) && m.nome.equals(nome) && m.ano == ano){
                System.out.println(m.nome);
                System.out.println(m.tipo);
                System.out.println(m.ano);
                System.out.println(m.nota);
            }
            if(!encontrou){
                System.out.println("Nao encontrado");
            }   
        }
    }
}