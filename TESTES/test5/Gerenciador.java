
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
                System.out.println("titulo: ");
            }
        }
    }


    
}
