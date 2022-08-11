package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.appventas.envio.cliente.values.PQR;
import co.com.sofka.domain.generic.DomainEvent;

public class PQREnviada extends DomainEvent {
    private final ContactoId contactoId;
    private final PQR pqr;

    public PQREnviada(ContactoId contactoId, PQR pqr) {
        super( "co.com.appventas.envio.PQREnviada");
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
