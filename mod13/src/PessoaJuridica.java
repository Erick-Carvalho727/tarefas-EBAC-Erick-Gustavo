import java.util.Date;

public class PessoaJuridica extends Pessoa{


    private String cnpj;

    public PessoaJuridica(String nome, String dataCriacao, String cnpj) {
        super(nome, dataCriacao);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
