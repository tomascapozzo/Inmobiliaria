package inmobiliaria.inmuebles;
import inmobiliaria.enumeraciones.Condicion;
import inmobiliaria.info.*;

import java.util.UUID;

public abstract class Propiedad {
    private final String id;
    private boolean disponible;
    private double dimension;
    private Condicion condicion;
    private DatosPersona propietario;
    private Direccion direccion;


    public Propiedad(DatosPersona data, Direccion direccion, boolean disponible, float dimension, Condicion condicion) {
        this.propietario = data;
        this.direccion = direccion;
        this.disponible = disponible;
        this.dimension = dimension;
        this.condicion = condicion;
        /// UUID genera un string random de 10 caracteres.
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString().replaceAll("-", "").substring(0, 10);
    }

    public String getId() {
        return this.id;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getDimension() {
        return this.dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public DatosPersona getDatosPersona() {
        return this.propietario;
    }

    public void setDatosPersona(DatosPersona datosPersona) {
        this.propietario = datosPersona;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
