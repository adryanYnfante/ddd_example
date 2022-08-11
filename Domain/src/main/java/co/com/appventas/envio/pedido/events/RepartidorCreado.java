package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.DatosPersonales;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.appventas.envio.pedido.values.RepartidorId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepartidorCreado extends DomainEvent {
    private final RepartidorId repartidorId;
    private final DatosPersonales datosPersonales;

    public RepartidorCreado(RepartidorId repartidorId, DatosPersonales datosPersonales) {
        super("co.com.appventas.envio.RepartidorCreado");
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
