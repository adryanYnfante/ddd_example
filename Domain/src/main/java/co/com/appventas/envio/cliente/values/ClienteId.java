package co.com.appventas.envio.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    private ClienteId(String valor) {
        super(valor);
    }

    public ClienteId () {};

    public static ClienteId of(String valor) {
        return new ClienteId(valor);
    }
}
