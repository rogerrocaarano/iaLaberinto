package Tarea1;

import Laberinto.ReglaMovimiento;
import Laberinto.SolverBase;

public class SolverEjercicio1A extends SolverBase {
    public SolverEjercicio1A() {
        super();
        super.reglas.add(new ReglaMovimiento(-1, 0));
        super.reglas.add(new ReglaMovimiento(0, 1));
        super.reglas.add(new ReglaMovimiento(1, 0));
        super.reglas.add(new ReglaMovimiento(0, -1));
    }
}
