package co.com.appventas.envio.orden.commands;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.sofka.domain.generic.Command;

public class CrearCarrito extends Command {
    private final CarritoId carritoId;
    private final OrdenId ordenId;

    public CrearCarrito(CarritoId carritoId, OrdenId ordenId) {
        this.carritoId = carritoId;
        this.ordenId = ordenId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }
}
