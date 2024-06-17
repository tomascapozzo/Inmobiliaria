package inmobiliaria.inmuebles;

import inmobiliaria.enumeraciones.Condicion;
import inmobiliaria.info.DatosPersona;
import inmobiliaria.info.Direccion;

public class Departamento extends Propiedad{
    private double expensas;
    private String amenities;

    public Departamento(DatosPersona data, Direccion direccion, boolean disponible, float dimension, Condicion condicion, double expensas, String amenities)
    {
        super(data,direccion, disponible, dimension, condicion);
        this.expensas = expensas;
        this.amenities = amenities;
    }

    private void setExpensas(double expensas){
        this.expensas = expensas;
    }

    private double getExpensas(){
        return expensas;
    }

    private void setAmenities(String amenities){
        this.amenities = amenities;
    }

    private String getAmenities(){
        return amenities;
    }

}