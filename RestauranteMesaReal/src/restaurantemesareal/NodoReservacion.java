package restaurantemesareal;

import restaurantemesareal.Reservacion;

public class NodoReservacion {

    private Reservacion reservacion;
    private NodoReservacion siguiente;
    private NodoReservacion anterior;

    public NodoReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
        this.siguiente = null;
        this.anterior = null;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public NodoReservacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoReservacion siguiente) {
        this.siguiente = siguiente;
    }

    public NodoReservacion getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoReservacion anterior) {
        this.anterior = anterior;
    }

}
