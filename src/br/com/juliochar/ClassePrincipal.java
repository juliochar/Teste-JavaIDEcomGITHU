package br.com.juliochar;

import br.com.juliochar.model.Gato;

public class ClassePrincipal {
    public static void main(String[] args){
        Livro livro = new Livro();
        Gato gato = new Gato();


        System.out.println(gato);
        System.out.println(livro);



    }
}

class Livro {
    public String livro;
    public int numPaginas;

}
