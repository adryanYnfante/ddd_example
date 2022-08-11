package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.Estado;
import co.com.appventas.envio.pedido.Repartidor;
import co.com.appventas.envio.pedido.values.Aislamiento;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoCreado extends DomainEvent {
    private final Aislamiento aislamiento;

    public PedidoCreado(Aislamiento aislamiento) {
        super("co.com.appventas.envio.PedidoCreado");
        this.aislamiento = aislamiento;
    }

    public Aislamiento getAislamiento() {
        return aislamiento;
    }
}
