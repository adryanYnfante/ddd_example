package co.com.appventas.envio.pedido.events;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.appventas.envio.pedido.values.TiempoDeEntrega;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCreado extends DomainEvent {
    private final EstadoId estadoId;
    private final TiempoDeEntrega tiempoDeEntrega;
    private final Entregado entregado;

    public EstadoCreado(EstadoId estadoId,TiempoDeEntrega tiempoDeEntrega, Entregado entregado) {
        super("co.com.appventas.envio.EstadoCreado");
        this.estadoId = estadoId;
        this.tiempoDeEntrega = tiempoDeEntrega;
        this.entregado = entregado;
    }

    public TiempoDeEntrega getTiempoDeEntrega() {
        return tiempoDeEntrega;
    }

    public Entregado getEntregado() {
        return entregado;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }
}
