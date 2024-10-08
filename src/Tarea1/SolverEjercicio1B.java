package Tarea1;

import Laberinto.Laberinto;

public class SolverEjercicio1B extends SolverEjercicio1A {
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
