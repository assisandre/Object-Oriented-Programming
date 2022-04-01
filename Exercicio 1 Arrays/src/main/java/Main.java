public class Main {

    public static void main(String[] args) {
        Membro[] membro = new Membro[10];
        Musica[] musica = new Musica[10];
        Banda banda = new Banda("Turma do pagode", "Rock");

        membro[0] = new Membro("André","Guitarrista");
        membro[1] = new Membro("Léo","Baterista");
        membro[2] = new Membro("Mateus","Vocalista");

        Empresario empresario = new Empresario("Rogerio", 123456789);
        musica[0] = new Musica("Worst", 2.50);
        banda.addMusicaNova(musica[0]);

        banda.addMembroNovo(membro[0]);
        banda.addMembroNovo(membro[1]);
        banda.addMembroNovo(membro[2]);

        banda.mostraInfo();
        System.out.println("Empresário: " + empresario.nome + empresario.cnpj);








    }
}
