package co.com.appventas.envio.orden;

import co.com.appventas.envio.orden.commands.GenerarFactura;
import co.com.appventas.envio.orden.values.Direccion;
import co.com.appventas.envio.orden.values.FacturaId;
import co.com.appventas.envio.orden.values.FechaFactura;
import co.com.appventas.envio.orden.values.OrdenId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;


@ExtendWith(MockitoExtension.class)
class OrdenTest<DomainEventRepository> {
    @Mock
    private DomainEventRepository repository;


    @Test
    void generarFactura() {

    }
}