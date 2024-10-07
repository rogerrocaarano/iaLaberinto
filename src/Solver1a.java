import Laberinto.ReglaMovimiento;
import Laberinto.SolverBase;

public class Solver1a extends SolverBase {
    public Solver1a() {
        super();
        super.reglas.add(new ReglaMovimiento(-1, 0));
        super.reglas.add(new ReglaMovimiento(0, 1));
        super.reglas.add(new ReglaMovimiento(1, 0));
        super.reglas.add(new ReglaMovimiento(0, -1));
        // comentario
    }
}
