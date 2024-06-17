package inmobiliaria.inmuebles;

import inmobiliaria.enumeraciones.Condicion;
import inmobiliaria.info.DatosPersona;
import inmobiliaria.info.Direccion;

public class Chalet extends Propiedad {
    private double superficieConstruida;


    public Chalet(DatosPersona data, Direccion direccion, boolean disponible, float dimension, Condicion condicion, double superficieConstruida)
    {
        super(data,direccion,disponible,dimension,condicion);
        this.superficieConstruida = superficieConstruida;
    }

    public void setSuperficieConstruida(double superficieConstruida){
        this.superficieConstruida = superficieConstruida;
    }

    public double getSuperficieConstruida() {
        return superficieConstruida;
    }
}