package co.com.appventas.envio.pedido.commands;

import co.com.appventas.envio.pedido.values.DatosPersonales;
import co.com.appventas.envio.pedido.values.RepartidorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDatosPersonalesDeRepartidor extends Command {
    private final RepartidorId repartidorId;
    private final DatosPersonales datosPersonales;

    public ActualizarDatosPersonalesDeRepartidor(RepartidorId repartidorId, DatosPersonales datosPersonales) {
        this.repartidorId = repartidorId;
        this.datosPersonales = datosPersonales;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
