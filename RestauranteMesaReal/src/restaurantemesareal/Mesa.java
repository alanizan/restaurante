package restaurantemesareal;


public class Mesa {

    private int numeroMesa;
    private int capacidad;
    private String estado;
    private ColaPedidos ListaPedidos;

    public Mesa() {
        this.numeroMesa = 0;
        this.capacidad = 0;
        this.estado = "";
        this.ListaPedidos = null;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ColaPedidos getListaPedidos() {
        return ListaPedidos;
    }

    public void setListaPedidos(ColaPedidos ListaPedidos) {
        this.ListaPedidos = ListaPedidos;
    }
}
