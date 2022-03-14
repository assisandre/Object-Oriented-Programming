package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(tipoTiro.equals("Tiro Explosivo")){
            ast.destruir();
        }
        else
        {
            if(ast.getTipoAsteroide().equals("Grande")){
                System.out.println("Nave " + nome + " não destruiu o asteroide");
            }

            else System.out.println("Asteroide " + ast.getNome()+ " destrído pela nave" + nome);
        }
    }
}
