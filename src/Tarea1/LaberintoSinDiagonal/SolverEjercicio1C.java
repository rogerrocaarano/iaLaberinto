package Tarea1.LaberintoSinDiagonal;

import Laberinto.Laberinto;

public class SolverEjercicio1C extends SolverEjercicio1B {
    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        // Negar la condición del ejercicio anterior (todas las casillas visitadas)
        return !super.condicionesAdicionalesSolucion(laberinto);
    }
}
