package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.entities.Contacto;
import co.com.appventas.envio.cliente.entities.Devolucion;
import co.com.appventas.envio.cliente.events.*;
import co.com.sofka.domain.generic.EventChange;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event) ->{
            cliente.datosPersonales = event.getDatosPersonalesCliente();
            cliente.bono= event.getBono();
        });
        apply((ContactoCreado event) ->{
            cliente.contactos.add(new Contacto(event.getContactoId(), event.getWhatsapp(), event.getPqr()));
        });
        apply((DevolucionCreada event) ->{
            cliente.devoluciones.add(new Devolucion(event.getDevolucionId(),event.getFecha(), event.getMotivo()));
        });
        apply((MotivoActualizado event) ->{
            var devolucion=cliente.getDevolucionPorId(event.getDevolucionId())
            .orElseThrow(() -> new IllegalArgumentException("no se encuentra la devolución"));
            devolucion.actualizarMotivo(event.getMotivo());
        });
        apply((PQREnviada event) ->{
            var pqr=cliente.getContactoPorId(event.getContactoId())
                    .orElseThrow(() -> new IllegalArgumentException("no se encuentra información de contacto"));
            pqr.EnviarPRQ(event.getPqr());
        });


    }

}
