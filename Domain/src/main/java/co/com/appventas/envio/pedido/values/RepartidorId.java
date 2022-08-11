package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.Identity;

public class RepartidorId extends Identity {

    private RepartidorId(){

    }

    private RepartidorId(String id){
        super(id);
    }

    public static RepartidorId of(String id){
        return new RepartidorId(id);
    }
}
