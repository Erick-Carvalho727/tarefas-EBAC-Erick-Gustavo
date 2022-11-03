



public class Menu {

    public static void main(String[] args) {

        Cliente primeiroCliente = new Cliente("A", true);
        Cliente segundoCliente = new Cliente("B", false);
        Fabrica fabrica = getFabricaCarro(primeiroCliente);
        Carro primeiroCarro = fabrica.create(primeiroCliente.getTipoCliente());
        primeiroCarro.startCarro();

        fabrica = getFabricaCarro(segundoCliente);
        Carro segundoCarro = fabrica.create(segundoCliente.getTipoCliente());
        segundoCarro.startCarro();

    }

    private static Fabrica getFabricaCarro(Cliente cliente) {

        if (cliente.isPremium()) {
            return new FabricaCarrosPremium();
        } else {
            return new FabricaCarros();
        }
    }

}
