package Solvers;

import Laberinto.Laberinto;
import Laberinto.SolverBase;
import Laberinto.ReglaMovimiento;

import java.util.LinkedList;

public class SolverB extends SolverBase {
    public SolverB(LinkedList<ReglaMovimiento> reglas) {
        super();
        super.reglas = reglas;
    }

    private boolean todasLasCasillasVisitadas(Laberinto laberinto) {
        for (int i = 0; i < laberinto.getNroFilas(); i++) {
            for (int j = 0; j < laberinto.getNroColumnas(); j++) {
                if (laberinto.get(i, j) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return todasLasCasillasVisitadas(laberinto);
    }
}
