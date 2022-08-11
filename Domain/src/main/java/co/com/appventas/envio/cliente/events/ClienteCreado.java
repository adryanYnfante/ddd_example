package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.Bono;
import co.com.appventas.envio.cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
     private final DatosPersonalesCliente datosPersonalesCliente;
     private final Bono bono;


    public ClienteCreado(DatosPersonalesCliente datosPersonalesCliente, Bono bono ) {
        super("co.com.appventas.envio.ClienteCreado");
        this.datosPersonalesCliente = datosPersonalesCliente;
        this.bono = bono;

    }

    public DatosPersonalesCliente getDatosPersonalesCliente() {
        return datosPersonalesCliente;
    }

    public Bono getBono() {
        return bono;
    }


}
