package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.events.CarritoCreado;
import co.com.appventas.envio.orden.events.ProductoCreado;
import co.com.appventas.envio.orden.events.ProductoEliminado;
import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Carrito extends AggregateEvent<CarritoId> {
    protected Set<Producto> productos;
    public Carrito(CarritoId carritoId) {
        super(carritoId);
        appendChange(new CarritoCreado()).apply();
    }

    public void agregarProducto(CarritoId carritoId, Nombre nombre, Descripcion descripcion, PrecioProducto precioProducto, Cantidad cantidad){
        Objects.requireNonNull(carritoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precioProducto);
        Objects.requireNonNull(cantidad);
        appendChange( new ProductoCreado(carritoId,nombre,descripcion,precioProducto,cantidad)).apply();
    }

    public void eliminarProducto(CarritoId carritoId, ProductoId productoId){
        Objects.requireNonNull(carritoId);
        Objects.requireNonNull(productoId);
        appendChange( new ProductoEliminado(carritoId,productoId)).apply();
    }

}
