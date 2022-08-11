package co.com.appventas.envio.cliente.commands;

import co.com.appventas.envio.cliente.values.Bono;
import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.cliente.values.DatosPersonalesCliente;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {
    private final ClienteId clienteId;
    private final DatosPersonalesCliente datosPersonalesCliente;
    private final Bono bono;

    public CrearCliente(ClienteId clienteId, DatosPersonalesCliente datosPersonalesCliente, Bono bono) {
        this.clienteId = clienteId;
        this.datosPersonalesCliente = datosPersonalesCliente;
        this.bono = bono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public DatosPersonalesCliente getDatosPersonalesCliente() {
        return datosPersonalesCliente;
    }

    public Bono getBono() {
        return bono;
    }
}
