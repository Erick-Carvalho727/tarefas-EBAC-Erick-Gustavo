



public abstract class Fabrica {

    public Carro create(String tipoCliente) {
        Carro carro = retriaveCarro(tipoCliente);
        return carro;
    }

    abstract Carro retriaveCarro(String tipoCliente);

}
