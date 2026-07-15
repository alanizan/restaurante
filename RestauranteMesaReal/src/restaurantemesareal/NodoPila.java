package restaurantemesareal;

import restaurantemesareal.PlatoCancelado;

public class NodoPila {

    private PlatoCancelado plato;
    private NodoPila siguiente;

    public NodoPila(PlatoCancelado plato) {
        this.plato = plato;
        this.siguiente = null;
    }

    public PlatoCancelado getPlato() {
        return plato;
    }

    public void setPlato(PlatoCancelado plato) {
        this.plato = plato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

}
