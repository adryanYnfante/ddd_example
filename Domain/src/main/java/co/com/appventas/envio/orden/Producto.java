package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    protected Nombre nombre;
    protected Descripcion descripcion;
    protected PrecioProducto precioProducto;
    protected Cantidad cantidad;

    public Producto(ProductoId productoId, Nombre nombre, Descripcion descripcion, PrecioProducto precioProducto, Cantidad cantidad) {
        super(productoId);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
    }
    public  void  cambiarCantidad(Cantidad cantidad){
        this.cantidad= Objects.requireNonNull(cantidad);
    }

    public Nombre nombre() {   return nombre;    }
    public Descripcion descripcion() {   return descripcion;    }
    public PrecioProducto precioProducto() {  return precioProducto;  }
    public Cantidad cantidad() {   return cantidad;  }


}