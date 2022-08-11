package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.events.*;
import co.com.sofka.domain.generic.EventChange;

public class OrdenChange extends EventChange {
    public OrdenChange(Orden orden) {
        apply((OrdenCreada event)->{
            orden.precio = event.getPrecio();
        });

        apply((ProductoACarritoAgregado event)-> {
            orden.agregarProductoACarrito(event.getOrdenId(), event.getCarritoId(),event.getNombre(), event.getDescripcion(), event.getPrecioProducto(), event.getCantidad());
        });

        apply((ProductoACarritoEliminado event)->{
            orden.productos.removeIf(e -> e.identity().equals(event.getProductoId()));
        });

        apply((CantidadProductoACarritoCambiada event)->{
            var productos=orden.getProductoPorId(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("no se encuentra información de producto"));
            productos.cambiarCantidad(event.getCantidad());
        });

        apply((FacturaCreada event)->{
            orden.generarFactura(event.getFacturaId(), event.getNombreCliente(), event.getFechaFactura(),event.getDireccion(),event.getPrecioFactura());
        });

        apply((CarritoHabilitado event)->{
            orden.crearCarrito(event.getOrdenId(), event.getCarritoId());
        });

    }
}
