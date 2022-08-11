package co.com.appventas.envio.cliente;

import co.com.appventas.envio.cliente.entities.Contacto;
import co.com.appventas.envio.cliente.entities.Devolucion;
import co.com.appventas.envio.cliente.events.*;
import co.com.appventas.envio.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cliente  extends AggregateEvent<ClienteId> {
    protected DatosPersonalesCliente datosPersonales;
    protected Bono bono;
    protected Set<Contacto> contactos;
    protected Set<Devolucion> devoluciones;

    public Cliente(ClienteId clienteId, DatosPersonalesCliente datosPersonales, Bono bono) {
        super(clienteId);
        appendChange(new ClienteCreado(datosPersonales, bono)).apply();
    }

    private Cliente(ClienteId clienteId){
        super(clienteId);
        subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent>events){
        var cliente= new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    //comportamiento
    public void agregarContacto(ContactoId contactoId, Whatsapp whatsapp, PQR pqr){
        Objects.requireNonNull(contactoId);
        Objects.requireNonNull(whatsapp);
        Objects.requireNonNull(pqr);
        appendChange(new ContactoCreado(contactoId, whatsapp, pqr)).apply();
    }
    public void agregarDevolucion(DevolucionId devolucionId, Fecha fecha, Motivo motivo){
        Objects.requireNonNull(devolucionId);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(motivo);
        appendChange(new DevolucionCreada(devolucionId, fecha, motivo)).apply();
    }
    public void  actualizarMotivodeDevolucion(DevolucionId devolucionId, Motivo motivo){
        Objects.requireNonNull(devolucionId);
        Objects.requireNonNull(motivo);
        appendChange(new MotivoActualizado(devolucionId,motivo)).apply();
    }
    public void  enviarPQR(ContactoId contactoId, PQR pqr){
        Objects.requireNonNull(contactoId);
        Objects.requireNonNull(pqr);
        appendChange(new PQREnviada(contactoId,pqr)).apply();
    }
    protected Optional<Contacto> getContactoPorId(ContactoId contactoId){
        return contactos
                .stream()
                .filter(contacto -> contacto.identity().equals(contactoId))
                .findFirst();
    }
    protected Optional<Devolucion> getDevolucionPorId(DevolucionId devolucionId){
        return devoluciones
                .stream()
                .filter(devolucion -> devolucion.identity().equals(devolucionId))
                .findFirst();
    }

}
