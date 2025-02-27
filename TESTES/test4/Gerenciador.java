package test4;

import java.util.ArrayList;

public class Gerenciador {

    boolean encontrou = false;

    ArrayList<Livro> array;

    public Gerenciador() {
        array = new ArrayList<>();
    }

    void cadastrar(String nome, String autor, String tipo, String status, int ano) {
        Livro l = new Livro(nome, autor, tipo, status, ano);
        array.add(l);
        System.out.println("cadastrado");
    }

    void listar() {
        if (array.isEmpty()) {
            System.out.println("vazia");
        } else {
            for (Livro l : array) {
                System.out.println("Nome: " + l.nome);
                System.out.println("Autor: " + l.autor);
                System.err.println("Tipo: " + l.tipo);
                System.out.println("Status: " + l.status);
                System.out.println("Ano: " + l.ano);
                System.out.println("-------------------");
            }
        }
    }

    void atualizar(String nome, String status) {
        for (Livro l : array) {
            if (l.nome.equals(nome)) {
                l.status = status;
                System.out.println("O status de leitura foi atualizado para " + status);
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    void remover(String nome) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).nome.equals(nome)) {
                array.remove(i);
                System.out.println("Removido");
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    void busca(String nome) {
        encontrou = false;
        for (Livro l : array) {
            if (l.nome.equals(nome)) {
                System.err.println("Nome: " + l.nome);
                System.err.println("Autor: " + l.autor);
                System.err.println("Tipo: " + l.tipo);
                System.err.println("Status: " + l.status);
                System.err.println("Ano: " + l.ano);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("não encontrado");
        }
    }
}

