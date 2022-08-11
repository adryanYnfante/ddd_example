package co.com.appventas.envio.pedido.commands;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.sofka.domain.generic.Command;

public class CambiarEntregadoDeEstado extends Command {
    private final EstadoId estadoId;
    private final Entregado entregado;

    public CambiarEntregadoDeEstado(EstadoId estadoId, Entregado entregado) {
        this.estadoId = estadoId;
        this.entregado = entregado;
    }

    public EstadoId getEstadoId() {
        return estadoId;
    }

    public Entregado getEntregado() {
        return entregado;
    }
}
