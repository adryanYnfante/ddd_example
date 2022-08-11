package co.com.appventas.envio.orden.commands;

import co.com.appventas.envio.orden.values.Cantidad;
import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.OrdenId;
import co.com.appventas.envio.orden.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public class CambiarCantidadDeProductosACarrito extends Command {
    private final OrdenId ordenId;
    private final CarritoId carritoId;
    private final ProductoId productoId;
    private final Cantidad cantidad;

    public CambiarCantidadDeProductosACarrito(OrdenId ordenId, CarritoId carritoId, ProductoId productoId, Cantidad cantidad) {
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
