package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String cantor;
    private int anoDeLancamento;
    private String album;
    private String genero;

    public Musica() {
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000) {
         return 10;
        }else {
            return 7;
        }

    }
    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Cantor: " + cantor);
        System.out.println("Álbum: " + album);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
    }

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
