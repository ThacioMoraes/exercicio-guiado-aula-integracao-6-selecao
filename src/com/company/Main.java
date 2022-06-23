package com.company;

import com.company.models.Jogador;
import com.company.models.Selecao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Selecao braza = new Selecao("CBF");

        Jogador j1 = new Jogador(9, "Pereira", "Atacante");
        Jogador j2 = new Jogador(10, "Júnior", "Defensor");
        Jogador j3 = new Jogador(11, "Gardin", "Goleiro");
        Jogador j4 = new Jogador(5, "Santos", "Atacante");
        Jogador j5 = new Jogador(8, "Moraes", "Atacante");
        Jogador j6 = new Jogador(1, "Oduber", "Goleiro");


        braza.addJogador(j1);
        braza.addJogador(j2);
        braza.addJogador(j3);
        braza.addJogador(j4);
        braza.addJogador(j5);
        braza.addJogador(j6);

        System.out.println(braza.obterReservas());
        System.out.println(braza.quantidadeDeJogadores("Falso 9"));
    }
}
