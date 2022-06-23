package com.company.models;

public class Jogador {

    private int numCamisa;
    private String sobrenome;
    private String posicao;

    public Jogador(int numCamisa, String sobrenome, String posicao) {
        if(posicao != "Goleiro" && posicao != "Defensor" && posicao != "Meio-campo" && posicao != "Atacante"){
            throw new PlayerException("Posicção inválida");
        }

        this.numCamisa = numCamisa;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
    }

    public String getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString(){
        return "{sobrenome: " + this.sobrenome + ", posicao: " + this.posicao + ", número da camisa : " + this.numCamisa + ".}";
    }

}
