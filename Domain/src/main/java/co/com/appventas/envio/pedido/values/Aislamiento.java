package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Aislamiento implements ValueObject<Boolean> {
    private final Boolean value;

    public Aislamiento(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return null;
    }
}
