package Inmuebles;
import Info.*;
public abstract class Propiedades {
    protected DatosPersona data;
    protected Direccion direccion;
    protected float precio;
    protected boolean disponible;
    protected float dimension;
    protected float superficie;
    protected String condicion;
    protected static int autoid = 1;
    private final int id;


    public Propiedades() {
        this.id = autoid;
        autoid++;
    }

    public Propiedades(String direccion, float precio, boolean disponible, float dimension, float superficie, int id, String condicion) {
        this.id = autoid;

        this.precio = precio;
        this.disponible = disponible;
        this.dimension = dimension;
        this.superficie = superficie;
        this.condicion = condicion;

        autoid++;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }
}
