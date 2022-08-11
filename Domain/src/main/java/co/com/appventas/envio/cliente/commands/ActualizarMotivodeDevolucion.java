package co.com.appventas.envio.cliente.commands;

import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.Command;

public class ActualizarMotivodeDevolucion extends Command {
    private final DevolucionId devolucionId;
    private final Motivo motivo;

    public ActualizarMotivodeDevolucion(DevolucionId devolucionId, Motivo motivo) {
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
