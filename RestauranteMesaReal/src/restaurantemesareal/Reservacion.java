package restaurantemesareal;

public class Reservacion {

private String codigo;
private Cliente cliente;
private String hora;
private Mesa MesaSolicitada;
private String estado;

    public Reservacion() {
        this.codigo = "";
        this.cliente = null;
        this.hora = "";
        this.MesaSolicitada = null;
        this.estado = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mesa getMesaSolicitada() {
        return MesaSolicitada;
    }

    public void setMesaSolicitada(Mesa MesaSolicitada) {
        this.MesaSolicitada = MesaSolicitada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    



}

