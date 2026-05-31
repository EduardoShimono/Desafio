package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Todas as Luzes");
        musica.setAlbum("Xtranho");
        musica.setCantor("Matue");
        musica.setAnoDeLancamento(2025);
        musica.setDuracao(2.30);
        musica.setIncluidoNoPlano(true);

        for (int i = 0; i < 1000; i++) {
            musica.repoduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }
        musica.exibirFichaTecnica();

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("Bolhadev");
        meuPodcast.setHost("Marcus Mendes");
        meuPodcast.setDescricao("""
                Um Podcast de devs e amantes da programação.""");
        for (int i = 0; i < 5000; i++) {
            meuPodcast.repoduzir();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(musica);
    }
}
