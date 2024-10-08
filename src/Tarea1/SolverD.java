package Tarea1;

import Laberinto.Laberinto;
import Laberinto.SolverBase;
import Laberinto.ReglaMovimiento;

import java.util.LinkedList;

public class SolverD extends SolverBase {
    public SolverD(LinkedList<ReglaMovimiento> reglas) {
        super();
        super.reglas = reglas;
    }

    @Override
    public LinkedList<Laberinto> getSoluciones() {
        // Algoritmo para obtener la solución de mayor longitud
        if (soluciones.size() <= 1) {
            return soluciones;
        }
        LinkedList<Laberinto> solucionesMaxLongitud = new LinkedList<>();
        int maxLongitud = soluciones.getFirst().getNroFilas() * soluciones.getFirst().getNroColumnas();
        while (maxLongitud > 0) {
            solucionesMaxLongitud = getSoluciones(maxLongitud);
            if (!solucionesMaxLongitud.isEmpty()) {
                break;
            }
            maxLongitud--;
        }
        return solucionesMaxLongitud;
    }
}
