import Laberinto.Laberinto;

import java.util.LinkedList;

public class Solver1E extends Solver1a {
    @Override
    public LinkedList<Laberinto> getSoluciones() {
        if (soluciones.size() <= 1) {
            return soluciones;
        }
        LinkedList<Laberinto> solucionesMinLongitud = new LinkedList<>();
        int maxLongitud = soluciones.getFirst().getNroFilas() * soluciones.getFirst().getNroColumnas();
        int minLongitud = 1;
        while (minLongitud <= maxLongitud) {
            solucionesMinLongitud = getSoluciones(minLongitud);
            if (!solucionesMinLongitud.isEmpty()) {
                break;
            }
            minLongitud++;
        }
        return solucionesMinLongitud;
    }
}
