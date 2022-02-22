package br.com.juliochar.model;

public class Gato {
    private String nome;
    private String cor;
    private int Idade;

    public Gato(){

    }
    public Gato(String nome, String cor, int idade){
        this.setNome(nome);
        this.setCor(cor);
        this.setIdade(idade);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}
