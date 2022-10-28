import java.util.Date;

public class Programa {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = cadastrarPessoaFisica("Erick", "2000-07-15", "01412512");
        PessoaJuridica pessoaJuridica1 = cadastrarPessoaJuridica("Grupo AA", "2000-08-16", "2541215");
        imprimir(pessoaFisica1);
        imprimir(pessoaJuridica1);
    }

    public static void imprimir(Pessoa pessoa) {
        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pF = (PessoaFisica) pessoa;
            System.out.println(pessoa.getNome() + " Possui o cpf: " + pF.getCpf() + "\nA conta foi criada na data: " + pF.getDataCriacao());
        } else {
            PessoaJuridica pF = (PessoaJuridica) pessoa;
            System.out.println(pessoa.getNome() + " Possui o cnpj: " + pF.getCnpj() + "\nA conta foi criada na data: " + pF.getDataCriacao());
        }

    }

    private static PessoaJuridica cadastrarPessoaJuridica(String nome, String dataCriacao, String cnpj) {
        return new PessoaJuridica(nome, dataCriacao, cnpj);
    }

    private static PessoaFisica cadastrarPessoaFisica(String nome, String dataCriacao, String cpf) {
        return new PessoaFisica(nome, dataCriacao, cpf);
    }

}
