package co.com.appventas.envio.cliente.events;

import co.com.appventas.envio.cliente.values.ClienteId;
import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.DomainEvent;

public class MotivoActualizado extends DomainEvent {
    private final DevolucionId devolucionId;
    private final Motivo motivo;

    public MotivoActualizado(DevolucionId devolucionId, Motivo motivo) {
        super("co.com.appventas.envio.MotivoActualizado");
        this.devolucionId = devolucionId;
        this.motivo = motivo;
    }

    public DevolucionId getDevolucionId() {
        return devolucionId;
    }

    public Motivo getMotivo() {
        return motivo;
    }
}
