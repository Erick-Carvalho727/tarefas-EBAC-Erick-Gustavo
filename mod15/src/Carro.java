



public abstract class Carro {

    private int cavalos;
    private String nome;
    private String cor;

    public Carro(int cavalos, String nome, String cor) {
        this.cavalos = cavalos;
        this.nome = nome;
        this.cor = cor;
    }

    public void startCarro(){
        System.out.println("O carro " + nome + " com " + cavalos + " cavalos" + " na cor " + cor + " está pronto para ser retirado!");
    }
}
