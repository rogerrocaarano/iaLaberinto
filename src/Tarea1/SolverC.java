package Tarea1;

import Laberinto.Laberinto;
import Laberinto.ReglaMovimiento;

import java.util.LinkedList;

public class SolverC extends SolverB {
    public SolverC(LinkedList<ReglaMovimiento> reglas) {
        super(reglas);
    }

    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        // Negar la condición del ejercicio anterior (todas las casillas visitadas)
        return !super.condicionesAdicionalesSolucion(laberinto);
    }
}
