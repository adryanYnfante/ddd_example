package co.com.appventas.envio.cliente.commands;

import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.appventas.envio.cliente.values.PQR;
import co.com.sofka.domain.generic.Command;

public class EnviarPQR extends Command {
    private final ContactoId contactoId;
    private final PQR pqr;

    public EnviarPQR(ContactoId contactoId, PQR pqr) {
        this.contactoId = contactoId;
        this.pqr = pqr;
    }

    public ContactoId getContactoId() {
        return contactoId;
    }

    public PQR getPqr() {
        return pqr;
    }
}
