package co.com.appventas.envio.pedido.commands;

import co.com.appventas.envio.pedido.values.Aislamiento;
import co.com.appventas.envio.pedido.values.PedidoId;
import co.com.sofka.domain.generic.Command;

public class CrearPedido extends Command {
    private final PedidoId pedidoId;
    private final Aislamiento aislamiento;

    public CrearPedido(PedidoId pedidoId, Aislamiento aislamiento) {
        this.pedidoId = pedidoId;
        this.aislamiento = aislamiento;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public Aislamiento getAislamiento() {
        return aislamiento;
    }
}
