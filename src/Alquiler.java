import inmobiliaria.enumeraciones.Meses;
import inmobiliaria.info.DatosPersona;
import inmobiliaria.inmuebles.Propiedad;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Alquiler {
    private Propiedad propiedad;
    private DatosPersona inquilino;
    private double monto;
    private LocalDateTime inicioAlquiler;
    private LocalDateTime finalAlquiler;
    // private HashMap<Meses, Recibo>


    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Propiedad getPropiedad(){
        return propiedad;
    }

    public void setInquilino(DatosPersona inquilino) {
        this.inquilino = inquilino;
    }

    public DatosPersona getInquilino() {
        return inquilino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDateTime inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDateTime getFinalAlquiler() {
        return finalAlquiler;
    }

    public void setFinalAlquiler(LocalDateTime finalAlquiler) {
        this.finalAlquiler = finalAlquiler;
    }
}
