


public class FabricaCarrosPremium extends Fabrica{

    @Override
    Carro retriaveCarro(String tipoCliente) {
        switch (tipoCliente) {
            case "A":
                return new Audi(780, "A5", "blue");
            case "B":
                return new Bmw(550, "320i", "blue");
            default:
                System.out.println("O carro para esse tipo de cliente não está disponivel");
                return null;
        }
    }
}
