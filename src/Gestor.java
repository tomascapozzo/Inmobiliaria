import inmobiliaria.interfaces.Buscable;
import inmobiliaria.interfaces.Filtrable;

import java.util.List;
import java.util.TreeSet;

public class Gestor<T extends Buscable<B> & Filtrable<F> , B, F> {
    private final TreeSet<T> elementos = new TreeSet<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(B criterio) {
        return elementos.stream().filter(elemento -> elemento.buscar(criterio)).findFirst().orElse(null);
    }

    public List<T> filtrar(F filter) {
        return elementos.stream().filter(elemento -> elemento.filtrar(filter)).toList();
    }

}
