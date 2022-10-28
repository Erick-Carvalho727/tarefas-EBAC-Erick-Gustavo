import java.util.Date;

public abstract class Pessoa {

    String nome;

    String dataCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Pessoa(String nome, String dataCriacao) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }
}