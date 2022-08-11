package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<DatosPersonales.Props> {
    private final String nombreCompleto;
    private final String telefono;
    private final String correo;

    public DatosPersonales(String nombreCompleto, String telefono, String correo) {
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto);
        this.telefono = Objects.requireNonNull(telefono);
        this.correo = Objects.requireNonNull(correo);
    }

   @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombreCompleto() {
                return nombreCompleto;
            }

            @Override
            public String telefono() {
                return telefono;
            }

            @Override
            public String correo() {
                return correo;
            }
        };
    }

    public interface Props{
        String nombreCompleto();
        String telefono();
        String correo();
    }
}
