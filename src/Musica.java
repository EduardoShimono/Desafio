public class Musica extends Audio{
    private String cantor;
    private int anoDeLancamento;
    private String album;

    @Override
    public int getClassificacao() {
        if (getCurtidas() > 500) {
         return 10;
        }else {
            return 7;
        }
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
}
