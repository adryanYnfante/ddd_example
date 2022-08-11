package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoCreado extends DomainEvent {

    private CarritoId carritoId;
    private Nombre nombre;
    private Descripcion descripcion;
    private PrecioProducto precioProducto;
    private Cantidad cantidad;

    public ProductoCreado(CarritoId carritoId, Nombre nombre, Descripcion descripcion, PrecioProducto precioProducto, Cantidad cantidad) {
        super("co.com.appventas.envio.ProductoCreado");
        this.carritoId = carritoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
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
