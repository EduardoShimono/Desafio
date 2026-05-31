package br.com.alura.minhasmusicas.modelos;

public class PodCast extends Audio {
    private String host;
    private String descricao;

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("o Host desse Pod Cast é o " + host);
        System.out.println(descricao);
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
