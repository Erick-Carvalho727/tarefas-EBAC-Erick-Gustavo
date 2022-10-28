import java.util.Date;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String dataCriacao, String cpf) {
        super(nome, dataCriacao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
