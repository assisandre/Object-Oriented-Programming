package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Ynoguti", 100, "Tiro Explosivo");
        Asteroide asteroide = new Asteroide("Cabeça de Jaca", "Grande");

        nave.atirar(asteroide);
    }
}
