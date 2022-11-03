

public class Cliente {

    private String tipoCliente;
    private boolean isPremium;

    public Cliente(String tipoCliente, boolean isPremium) {
        this.tipoCliente = tipoCliente;
        this.isPremium = isPremium;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
