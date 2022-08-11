package co.com.appventas.envio.pedido.values;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {

    private PedidoId(){

    }

    private PedidoId(String id){
        super(id);
    }

    public static PedidoId of(String id){
        return new PedidoId(id);
    }
}
