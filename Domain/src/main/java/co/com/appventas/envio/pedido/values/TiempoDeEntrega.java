package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TiempoDeEntrega implements ValueObject<String> {
    private final String value;

    public TiempoDeEntrega(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return null;
    }
}
