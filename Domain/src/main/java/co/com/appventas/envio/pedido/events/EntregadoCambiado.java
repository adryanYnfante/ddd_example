package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EntregadoCambiado extends DomainEvent {
    private final EstadoId estadoId;
    private final Entregado entregado;

    public EntregadoCambiado(EstadoId estadoId, Entregado entregado) {
        super("co.com.appventas.envio.EntregadoCambiado");
        this.estadoId = estadoId;
        this.entregado = entregado;
    }

    public Entregado getEntregado() {
        return entregado;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }
}
