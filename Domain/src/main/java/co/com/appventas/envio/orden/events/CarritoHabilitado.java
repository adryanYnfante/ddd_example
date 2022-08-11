package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.sofka.domain.generic.DomainEvent;

public class CarritoHabilitado extends DomainEvent {
    private final OrdenId ordenId;
    private final CarritoId carritoId;

    public CarritoHabilitado(OrdenId ordenId, CarritoId carritoId) {
        super("co.com.appventas.envio.CarritoHabilitado");
        this.ordenId = ordenId;
        this.carritoId = carritoId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }
}
