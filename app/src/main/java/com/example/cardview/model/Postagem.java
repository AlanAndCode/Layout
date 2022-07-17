package com.example.cardview.model;

public class Postagem {
    private String nome;
    private String postagem;
    private int Imagem;

    public Postagem() {
    }

    public Postagem(String nome, String postagem, int imagem) {
        this.nome = nome;
        this.postagem = postagem;
        Imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }
}
