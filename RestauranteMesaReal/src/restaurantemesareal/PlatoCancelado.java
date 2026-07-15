
package restaurantemesareal;


public class PlatoCancelado {

private int numeroPedido;
private String motivo;
private String fecha;
private String responsable;

    public PlatoCancelado() {
        this.numeroPedido = 0;
        this.motivo = "";
        this.fecha = "";
        this.responsable = "";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }



    
}
