package com.company.models;

import java.util.ArrayList;

public class Selecao {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public Selecao(String nome) {
        this.nome = nome;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void addJogador(ArrayList<Jogador> jogadoresPraAdicionar){
        jogadores.addAll(jogadoresPraAdicionar);
    }

    public ArrayList<Jogador> obterReservas(){
        ArrayList<Jogador> reservas = new ArrayList<Jogador>();
        for(int i = 1; i < 6; i ++){
            reservas.add(this.jogadores.get(this.jogadores.size() - i));
        }
        return reservas;
    }

    public int quantidadeDeJogadores(String posicao){

        if(posicao != "Goleiro" && posicao != "Defensor" && posicao != "Meio-campo" && posicao != "Atacante"){
            throw new PlayerException("Posição inválida");
        }

        ArrayList<Jogador> jogadoresPosicao = new ArrayList<Jogador>();

        for(Jogador jogador: this.jogadores){
            if(jogador.getPosicao() == posicao){
                jogadoresPosicao.add(jogador);
            }
        }
        return jogadoresPosicao.size();
    }
}
