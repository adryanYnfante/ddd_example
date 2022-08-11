package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.CarritoId;
import co.com.appventas.envio.orden.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoEliminado extends DomainEvent {
    private CarritoId carritoId;
    private ProductoId productoId;

    public ProductoEliminado(CarritoId carritoId, ProductoId productoId) {
        super("co.com.appventas.envio.ProductoEliminado");
        this.carritoId = carritoId;
        this.productoId = productoId;
    }

    public CarritoId getCarritoId() {
        return carritoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
