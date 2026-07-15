package restaurantemesareal;

public class Cliente {

    private String nombre;
    private int CantidadPersonas;
    private Mesa MesaAsignada;
    private String estado;
    private String horaIngreso;

    public Cliente() {
        this.nombre = "";
        this.CantidadPersonas = 0;
        this.MesaAsignada = null;
        this.estado = "";
        this.horaIngreso = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public Mesa getMesaAsignada() {
        return MesaAsignada;
    }

    public void setMesaAsignada(Mesa MesaAsignada) {
        this.MesaAsignada = MesaAsignada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

}
