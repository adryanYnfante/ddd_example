package co.com.appventas.envio.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Bono implements ValueObject<Bono.Props> {
    private final String valorDescuento;
    private final String fechaValida;

    public Bono(String valorDescuento, String fechaValida) {
        this.valorDescuento = valorDescuento;
        this.fechaValida = fechaValida;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String valorDescuento() {
                return valorDescuento;
            }
            @Override
            public String fechaValida() {
                return fechaValida;
            }
        };
    }
    public interface Props {
        String valorDescuento();
        String fechaValida();
    }
}
