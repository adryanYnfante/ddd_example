package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Factura extends Entity<FacturaId> {
     protected NombreCliente nombreCliente;
     protected FechaFactura fechaFactura;
     protected Direccion direccion;
     protected PrecioFactura precioFactura;

     public Factura(FacturaId facturaId, NombreCliente nombreCliente, FechaFactura fechaFactura, Direccion direccion,PrecioFactura precioFactura) {
        super(facturaId);
        this.nombreCliente = nombreCliente;
        this.fechaFactura= fechaFactura;
        this.direccion= direccion;
        this.precioFactura=precioFactura;

    }

    public void cambiarDireccion(Direccion direccion){
         this.direccion = Objects.requireNonNull(direccion);
    }

}
