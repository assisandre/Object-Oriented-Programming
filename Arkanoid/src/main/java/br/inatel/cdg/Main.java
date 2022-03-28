package br.inatel.cdg;

import br.inatel.cdg.Bloco.Bloco;
import br.inatel.cdg.Jogador.Jogador;

public class Main {

    public static void main(String[] args) {

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruirBloco(bloco1);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

        jogador.destruirBloco(bloco2);

        System.out.println("Blocos em jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontos do jogador: " + jogador.getPonto());

    }
}
