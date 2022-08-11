package co.com.appventas.envio.orden;


import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.orden.events.*;
import co.com.appventas.envio.orden.values.*;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Orden extends AggregateEvent<OrdenId> {
    protected PedidoId pedidoId;
    protected ClienteId clienteId;
    protected CarritoId carritoId;
    protected FacturaId facturaId;
    protected Set<Producto> productos;
    protected Precio precio;

    public Orden(OrdenId ordenId, Precio precio) {
        super(ordenId);
        appendChange(new OrdenCreada(precio)).apply();
    }

    private Orden(OrdenId ordenId){
        super(ordenId);
        subscribe(new OrdenChange(this));
    }


    public void agregarProductoACarrito(OrdenId ordenId, CarritoId carritoId, Nombre nombre, Descripcion descripcion, PrecioProducto precioProducto, Cantidad cantidad){
        Objects.requireNonNull(ordenId);
        Objects.requireNonNull(carritoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precioProducto);
        Objects.requireNonNull(cantidad);
        appendChange( new ProductoACarritoAgregado(ordenId,carritoId,nombre,descripcion,precioProducto,cantidad)).apply();

    }

    public void eliminarProductoACarrito(OrdenId ordenId, CarritoId carritoId, ProductoId productoId){
        Objects.requireNonNull(ordenId);
        Objects.requireNonNull(carritoId);
        Objects.requireNonNull(productoId);
        appendChange( new ProductoACarritoEliminado(ordenId,carritoId,productoId)).apply();
    }

    public void cambiarCantidadDeProductosACarrito(OrdenId ordenId, CarritoId carritoId, ProductoId productoId, Cantidad cantidad){
        Objects.requireNonNull(ordenId);
        Objects.requireNonNull(carritoId);
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(cantidad);
        appendChange( new CantidadProductoACarritoCambiada(ordenId,carritoId,productoId,cantidad)).apply();
    }

    public void generarFactura(FacturaId facturaId, NombreCliente nombreCliente, FechaFactura fechaFactura, Direccion direccion,PrecioFactura precioFactura){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(nombreCliente);
        Objects.requireNonNull(fechaFactura);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(precioFactura);
        appendChange( new FacturaCreada(facturaId,nombreCliente,fechaFactura,direccion,precioFactura)).apply();
    }

    public void crearCarrito(OrdenId ordenId, CarritoId carritoId){
        Objects.requireNonNull(ordenId);
        Objects.requireNonNull(carritoId);
        appendChange( new CarritoHabilitado(ordenId,carritoId)).apply();
    }

    protected Optional<Producto> getProductoPorId(ProductoId productoId){
        return productos
                .stream()
                .filter(contacto -> contacto.identity().equals(productoId))
                .findFirst();
    }

}
