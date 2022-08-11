package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.appventas.envio.cliente.values.Fecha;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.DomainEvent;

public class DevolucionCreada extends DomainEvent {
    private final DevolucionId devolucionId;
    private final Fecha fecha;
    private final Motivo motivo;

    public DevolucionCreada(DevolucionId devolucionId,Fecha fecha, Motivo motivo) {
        super("co.com.appventas.envio.DevolucionCreada");
        this.devolucionId=devolucionId;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public DevolucionId getDevolucionId() {
        return devolucionId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Motivo getMotivo() {
        return motivo;
    }
}
