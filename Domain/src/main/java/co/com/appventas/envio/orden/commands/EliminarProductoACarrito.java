package co.com.appventas.envio.orden.commands;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.appventas.envio.orden.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public class EliminarProductoACarrito extends Command {
    private final OrdenId ordenId;
    private final CarritoId carritoId;
    private final ProductoId productoId;

    public EliminarProductoACarrito(OrdenId ordenId, CarritoId carritoId, ProductoId productoId) {
        this.ordenId = ordenId;
        this.carritoId = carritoId;
        this.productoId = productoId;
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
}
