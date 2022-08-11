package co.com.appventas.envio.pedido;

import co.com.appventas.envio.pedido.values.DatosPersonales;
import co.com.appventas.envio.pedido.values.RepartidorId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Repartidor extends Entity<RepartidorId> {
    private DatosPersonales datosPersonales;

    public Repartidor(RepartidorId repartidorId, DatosPersonales datosPersonales) {
        super(repartidorId);
        this.datosPersonales = datosPersonales;
    }

    public void actualizarDatosPersonales(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }
}
