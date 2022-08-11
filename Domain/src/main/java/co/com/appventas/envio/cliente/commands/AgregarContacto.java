package co.com.appventas.envio.cliente.commands;

import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.appventas.envio.cliente.values.PQR;
import co.com.appventas.envio.cliente.values.Whatsapp;
import co.com.sofka.domain.generic.Command;

public class AgregarContacto extends Command {
    private final ContactoId contactoId;
    private final Whatsapp whatsapp;
    private final PQR pqr;

    public AgregarContacto(ContactoId contactoId, Whatsapp whatsapp, PQR pqr) {
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
