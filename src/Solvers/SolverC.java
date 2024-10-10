package Solvers;

import Laberinto.Laberinto;
import Laberinto.Regla;

import java.util.LinkedList;

public class SolverC extends SolverB {
    public SolverC(LinkedList<Regla> reglas) {
        super(reglas);
    }

    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        // Negar la condición del ejercicio anterior (todas las casillas visitadas)
        return !super.condicionesAdicionalesSolucion(laberinto);
    }
}
