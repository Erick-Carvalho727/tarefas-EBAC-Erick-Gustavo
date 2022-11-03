


public class FabricaCarros extends Fabrica{

    Carro retriaveCarro(String tipoCliente) {
        switch (tipoCliente) {
            case "A":
                return new Volksvagem(180, "Taos", "blue");
            case "B":
                return new Bmw(120, "Cronos", "Red");
            default:
                System.out.println("O carro para esse tipo de cliente não está disponivel");
                return null;
        }
    }

}
