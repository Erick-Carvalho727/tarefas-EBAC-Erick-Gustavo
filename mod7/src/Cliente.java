public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private int cartao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public void cadastrarCartao(int cartao){
        setCartao(cartao);
    }

    public void imprimirCartao() {
        System.out.println("Seu número de cartão é: " + this.cartao);
    }

}