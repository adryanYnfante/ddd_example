package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class OrdenCreada extends DomainEvent {
    private Precio precio;

    public OrdenCreada(Precio precio) {
        super("co.com.appventas.envio.OrdenCreada");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
