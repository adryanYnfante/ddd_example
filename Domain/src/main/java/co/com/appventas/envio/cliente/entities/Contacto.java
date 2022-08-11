package co.com.appventas.envio.cliente.entities;

import co.com.appventas.envio.cliente.values.ContactoId;
import co.com.appventas.envio.cliente.values.PQR;
import co.com.appventas.envio.cliente.values.Whatsapp;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;


public class Contacto extends Entity<ContactoId> {

    private Whatsapp whatsapp;
    private PQR pqr;

    public Contacto(ContactoId contactoId, Whatsapp whatsapp, PQR pqr) {
        super(contactoId);
        this.whatsapp = whatsapp;
        this.pqr = pqr;
    }
    public Whatsapp Whatsapp() {
        return whatsapp;
    }

    public PQR Pqr() {
        return pqr;
    }

    public void EnviarPRQ(PQR Pqr) {
        this.pqr = Objects.requireNonNull(pqr);
    }


}
