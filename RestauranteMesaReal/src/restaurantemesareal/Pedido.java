package restaurantemesareal;


public class Pedido {

private int numeroPedido;
private Mesa mesa;
private String platillos;
private String estado;

    public Pedido() {
        this.numeroPedido = 0;
        this.mesa = null;
        this.platillos = "";
        this.estado = "";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getPlatillos() {
        return platillos;
    }

    public void setPlatillos(String platillos) {
        this.platillos = platillos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
