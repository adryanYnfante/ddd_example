package co.com.appventas.envio.cliente.commands;

import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.appventas.envio.cliente.values.Fecha;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.Command;

public class AgregarDevolucion extends Command {
    private final DevolucionId devolucionId;
    private final Fecha fecha;
    private final Motivo motivo;

    public AgregarDevolucion(DevolucionId devolucionId, Fecha fecha, Motivo motivo) {
        this.devolucionId = devolucionId;
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
