package inmobiliaria.info;

public class Direccion {
    private String altura;
    private String calle;
    private String localidad;
    private String piso;
    private String depto;

    public Direccion(String altura) {
    }

    public Direccion(String altura, String calle, String localidad, String piso, String depto) {
        this.altura = altura;
        this.calle = calle;
        this.localidad = localidad;
        this.piso = piso;
        this.depto = depto;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
}
