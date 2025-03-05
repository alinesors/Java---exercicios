
import java.util.ArrayList;



public class Gerenciador {
    
    boolean encontrou = false;

    ArrayList<Livro> array;

    public Gerenciador(){
        array = new ArrayList<>();
    }

    public void cadastrar(String titulo, String autor, int numeroPaginas, String status){
        Livro l = new Livro(titulo, autor, numeroPaginas, status);

        array.add(l);
        System.out.println("Livro adicionado!");
    }

    public void buscar(String status){
        encontrou = false;
        for( Livro l  :  array){
            if(l.status.equals(status)){
                System.out.println("----------------------");
                System.out.println("titulo: " + l.titulo);
                System.out.println("autor: " + l.autor);
                System.out.println("numero de paginas: " + l.numeroPaginas);
                System.out.println("status de leitura: " + l.status);
                System.out.println("----------------------");
                encontrou = true;
            }
            if(!encontrou){
                System.out.println("Livro não encontrado");
            }
        }
    }

    public void listar(){
        if(array.isEmpty()){
            System.out.println("Lista de livros vazia");
        }
        for(Livro l : array){
            System.out.println("----------------------");
            System.out.println("Lista de Livros:");
            System.out.println("----------------------");
            System.out.println("titulo: " + l.titulo);
            System.out.println("autor: " + l.autor);
            System.out.println("numero de paginas: " + l.numeroPaginas);
            System.out.println("status de leitura: " + l.status);
            System.out.println("----------------------");
        }
    }

    public void atualizar(String status, string titulo){
        Livro l = array.get(titulo);
        l.status = status;
        array.set(index, l);
        System.out.println("Status foi atualizado!");
    }

    public void remover(int titulo){
        array.remove(titulo);
        System.out.println("O livro foi removido!");
    }
    
}
