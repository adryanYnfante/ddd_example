package co.com.appventas.envio.orden.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Props> {
    private final String ciudad;
    private final String barrio;
    private final String nomenclatura;


    public Direccion(String ciudad, String barrio, String nomenclatura) {
        this.ciudad = Objects.requireNonNull(ciudad);
        this.barrio = Objects.requireNonNull(barrio);
        this.nomenclatura = Objects.requireNonNull(nomenclatura);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String barrio() {
                return barrio;
            }

            @Override
            public String nomenclatura() {
                return nomenclatura;
            }
        };
    }

    public interface Props {
        String ciudad();
        String barrio();
        String nomenclatura();

        }
    }

