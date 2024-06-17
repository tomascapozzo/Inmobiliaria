import inmobiliaria.info.DatosPersona;
import inmobiliaria.inmuebles.Propiedad;

import java.time.LocalDateTime;

public class Venta {
    private Propiedad propiedad;
    private DatosPersona comprador;
    private double valor;
    private LocalDateTime fechaVenta;
}
