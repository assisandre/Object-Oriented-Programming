package br.inatel.cdg.Jogador;

import br.inatel.cdg.Bloco.Bloco;

public class Jogador {

    private int ponto;

    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto++;
    }

    public int getPonto() {
        return this.ponto;
    }
}
