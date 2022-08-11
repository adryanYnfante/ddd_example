package co.com.appventas.envio.orden.commands;

import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarProductoACarrito extends Command {
    private final OrdenId ordenId;
    private final CarritoId carritoId;
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final PrecioProducto precioProducto;
    private final Cantidad cantidad;

    public AgregarProductoACarrito(OrdenId ordenId, CarritoId carritoId, Nombre nombre, Descripcion descripcion, PrecioProducto precioProducto, Cantidad cantidad) {
        this.ordenId = ordenId;
        this.carritoId = carritoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
    }

    public OrdenId getOrdenId() {
        return ordenId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
