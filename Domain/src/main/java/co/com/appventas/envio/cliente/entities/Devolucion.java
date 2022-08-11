package co.com.appventas.envio.cliente.entities;

import co.com.appventas.envio.cliente.values.DevolucionId;
import co.com.appventas.envio.cliente.values.Fecha;
import co.com.appventas.envio.cliente.values.Motivo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Devolucion extends Entity<DevolucionId> {
    private Fecha fecha;
    private Motivo motivo;

    public Devolucion(DevolucionId devolucionId, Fecha fecha, Motivo motivo) {
        super(devolucionId);
        this.fecha=fecha;
        this.motivo=motivo;
    }

    public void actualizarMotivo(Motivo motivo){
        this.motivo= Objects.requireNonNull(motivo);
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Motivo getMotivo() {
        return motivo;
    }
}
