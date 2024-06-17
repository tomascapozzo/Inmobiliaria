package inmobiliaria.inmuebles;

import inmobiliaria.enumeraciones.Condicion;
import inmobiliaria.info.DatosPersona;
import inmobiliaria.info.Direccion;

public class Local extends Propiedad{
    private double expensas;

    public Local(DatosPersona data, Direccion direccion, boolean disponible, float dimension, Condicion condicion, double expensas){
        super(data, direccion, disponible, dimension, condicion);
        this.expensas = expensas;
    }

    private void setExpensas(double expensas){
        this.expensas = expensas;
    }

    private double getExpensas(){
        return expensas;
    }
}
