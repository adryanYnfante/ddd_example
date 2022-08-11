package co.com.appventas.envio.pedido.values;

import co.com.appventas.envio.pedido.Estado;
import co.com.sofka.domain.generic.Identity;

public class EstadoId extends Identity {

    private EstadoId(){

    }

    private EstadoId(String id){
        super(id);
    }

    private static EstadoId of(String id){
        return new EstadoId(id);
    }
}
