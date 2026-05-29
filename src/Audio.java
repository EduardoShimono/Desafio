public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int Classificacao;

    public void curtir() {
        this.curtidas++;
        System.out.println("você acabou de curtir o titulo " + titulo);
    }
    public void repoduzir(){
        this.totalDeReproducoes++;
        System.out.println("O numero de repoduções do titulo aumentou.");
    }
    public void exibirFichaTecnica(){
        System.out.println("Título:" + titulo);
        System.out.println("duração:" + duracao);
        System.out.println("Curtidas:" + curtidas);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getClassificacao() {
        return Classificacao;
    }
    public void setClassificacao(int classificacao) {
        Classificacao = classificacao;
    }
}
