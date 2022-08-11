package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.Entregado;
import co.com.appventas.envio.pedido.values.EstadoId;
import co.com.appventas.envio.pedido.values.TiempoDeEntrega;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Estado extends Entity<EstadoId> {
    private TiempoDeEntrega tiempoDeEntrega;
    private Entregado entregado;

    public Estado(EstadoId estadoId, TiempoDeEntrega tiempoDeEntrega, Entregado entregado) {
        super(estadoId);
        this.tiempoDeEntrega = tiempoDeEntrega;
        this.entregado = entregado;
    }

    public void cambiarEntregado(Entregado entregado){
        this.entregado = Objects.requireNonNull(entregado);
    }

    public TiempoDeEntrega tiempoDeEntrega() {
        return tiempoDeEntrega;
    }

    public Entregado entregado() {
        return entregado;
    }
}
