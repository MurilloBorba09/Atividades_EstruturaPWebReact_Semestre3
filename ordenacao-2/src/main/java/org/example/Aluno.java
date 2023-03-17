package org.example;

public class Aluno {

    private String nome;
    private String sala;

    public Aluno(String nome, String sala) {
        this.nome = nome;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "\n Nome = " + nome +
                "\n Sala = " + sala;
    }
}
