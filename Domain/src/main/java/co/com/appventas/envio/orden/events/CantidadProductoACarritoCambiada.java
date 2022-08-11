package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.Cantidad;
import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.appventas.envio.orden.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class CantidadProductoACarritoCambiada extends DomainEvent {
    private final OrdenId ordenId;
    private final CarritoId carritoId;
    private final ProductoId productoId;
    private final Cantidad cantidad;

    public CantidadProductoACarritoCambiada(OrdenId ordenId, CarritoId carritoId, ProductoId productoId, Cantidad cantidad) {
        super("co.com.appventas.envio.CantidadProductoACarritoCambiada");
        this.ordenId = ordenId;
        this.carritoId = carritoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
