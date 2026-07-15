package restaurantemesareal;


public class NodoMesa {

private Mesa mesa;
private NodoMesa izquierdo;
private NodoMesa derecho;

    public NodoMesa(Mesa mesa) {
        this.mesa = mesa;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public NodoMesa getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoMesa izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoMesa getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoMesa derecho) {
        this.derecho = derecho;
    }


}
