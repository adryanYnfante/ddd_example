package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.events.*;
import co.com.appventas.envio.pedido.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;


public class Pedido extends AggregateEvent<PedidoId> {
    protected Estado estado;
    protected Repartidor repartidor;
    protected Aislamiento aislamiento;

    public Pedido(PedidoId pedidoId, Aislamiento aislamiento) {
        super(pedidoId);
        appendChange(new PedidoCreado(aislamiento)).apply();
    }

    private Pedido(PedidoId pedidoId){
        super(pedidoId);
        subscribe(new PedidoChange(this));
    }

    public static Pedido from(PedidoId pedidoId, List<DomainEvent> events){
        var pedido = new Pedido(pedidoId);
        events.forEach(pedido::applyEvent);
        return pedido;
    }

    public void agregarEstado(EstadoId estadoId,TiempoDeEntrega tiempoDeEntrega, Entregado entregado){
        Objects.requireNonNull(estadoId);
        Objects.requireNonNull(tiempoDeEntrega);
        Objects.requireNonNull(entregado);
        appendChange(new EstadoCreado(estadoId,tiempoDeEntrega,entregado)).apply();
    }

    public void agregarRepartidor(RepartidorId repartidorId, DatosPersonales datosPersonales){
        Objects.requireNonNull(repartidorId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new RepartidorCreado(repartidorId,datosPersonales)).apply();
    }

    public void cambiarEntregadoDeEstado(EstadoId estadoId, Entregado entregado){
        Objects.requireNonNull(estadoId);
        Objects.requireNonNull(entregado);
        appendChange(new EntregadoCambiado(estadoId,entregado)).apply();
    }

    public void actualizarDatosPersonalesDeRepartidor(RepartidorId repartidorId, DatosPersonales datosPersonales){
        Objects.requireNonNull(repartidorId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new DatosPersonalesActualizados(repartidorId,datosPersonales)).apply();
    }

    public Aislamiento aislamiento(){
        return aislamiento;
    }

    public Estado estado(){
        return estado;
    }

    public Repartidor repartidor(){
        return repartidor;
    }


}
