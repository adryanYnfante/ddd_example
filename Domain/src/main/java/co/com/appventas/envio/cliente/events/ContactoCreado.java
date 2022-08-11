package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.PQR;
import co.com.appventas.envio.cliente.values.Whatsapp;
import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ContactoCreado extends DomainEvent {
    private final ContactoId contactoId;
    private final  Whatsapp whatsapp;
    private final PQR pqr;

    public ContactoCreado(ContactoId contactoId, Whatsapp whatsapp, PQR pqr) {
        super("co.com.appventas.envio.ContactoCreado");
        this.contactoId = contactoId;
        this.whatsapp = whatsapp;
        this.pqr = pqr;
    }

    public ContactoId getContactoId() {
        return contactoId;
    }

    public Whatsapp getWhatsapp() {
        return whatsapp;
    }

    public PQR getPqr() {
        return pqr;
    }
}
