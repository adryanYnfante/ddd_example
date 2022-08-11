package co.com.appventas.envio.pedido.commands;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.appventas.envio.pedido.values.TiempoDeEntrega;
import co.com.sofka.domain.generic.Command;

public class AgregarEstado extends Command {
    private final EstadoId estadoId;
    private final TiempoDeEntrega tiempoDeEntrega;
    private final Entregado entregado;

    public AgregarEstado(EstadoId estadoId, TiempoDeEntrega tiempoDeEntrega, Entregado entregado) {
        this.estadoId = estadoId;
        this.tiempoDeEntrega = tiempoDeEntrega;
        this.entregado = entregado;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }

    public TiempoDeEntrega getTiempoDeEntrega() {
        return tiempoDeEntrega;
    }

    public Entregado getEntregado() {
        return entregado;
    }
}
