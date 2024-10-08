package Tarea1;

import Laberinto.Laberinto;
import Laberinto.SolverBase;
import Laberinto.ReglaMovimiento;

import java.util.LinkedList;

public class SolverE extends SolverBase {
    public SolverE(LinkedList<ReglaMovimiento> reglas) {
        super();
        super.reglas = reglas;
    }
    @Override
    public LinkedList<Laberinto> getSoluciones() {
        // Algoritmo para obtener la solución de menor longitud
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
