package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.DatosPersonales;
import co.com.appventas.envio.pedido.values.RepartidorId;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosPersonalesActualizados extends DomainEvent {
    private final RepartidorId repartidorId;
    private final DatosPersonales datosPersonales;

    public DatosPersonalesActualizados(RepartidorId repartidorId,DatosPersonales datosPersonales) {
        super("co.com.appventas.envio.DatosPersonalesActualizados");
        this.repartidorId = repartidorId;
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public RepartidorId getRepartidorId() {
        return repartidorId;
    }
}
