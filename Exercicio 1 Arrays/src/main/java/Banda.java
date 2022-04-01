import java.util.Scanner;

public class Banda {

    String nome;
    String genero;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    void mostraInfo(){
        System.out.println("Banda: " + this.nome);
        System.out.println("Gênero: " + this.genero);
    }

    void addMusicaNova(Musica musica){
    }

    void addMembroNovo(Membro membro){

    }



}
