package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean incluidoNoPlano;

    public Audio() {
    }

    public void curtir() {
        this.curtidas++;
    }
    public void repoduzir(){
        this.totalDeReproducoes++;
    }
    public void exibirFichaTecnica(){
        System.out.println("Título:" + titulo);
        System.out.println("duração:" + duracao);
        System.out.println("Curtidas:" + curtidas);
        System.out.println("é incluido no plano: " + incluidoNoPlano);
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
    public int getCurtidas() {
        return curtidas;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
