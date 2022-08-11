package co.com.appventas.envio.orden.events;

import co.com.appventas.envio.orden.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCreada extends DomainEvent {
    private final FacturaId facturaId;
    private final NombreCliente nombreCliente;
    private final FechaFactura fechaFactura;
    private final  Direccion direccion;
    private final PrecioFactura precioFactura;

    public FacturaCreada(FacturaId facturaId, NombreCliente nombreCliente, FechaFactura fechaFactura, Direccion direccion, PrecioFactura precioFactura) {
        super("co.com.appventas.envio.FacturaCreada");
        this.facturaId = facturaId;
        this.nombreCliente = nombreCliente;
        this.fechaFactura = fechaFactura;
        this.direccion = direccion;
        this.precioFactura = precioFactura;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public FechaFactura getFechaFactura() {
        return fechaFactura;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }
}
