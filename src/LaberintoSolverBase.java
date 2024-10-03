import java.util.LinkedList;

public abstract class LaberintoSolverBase implements ILaberintoSolver {
    protected LinkedList<Laberinto> soluciones = new LinkedList<>();

    @Override
    public void resolver(Laberinto laberinto, int i, int j, int iFin, int jFin, int paso) {
        if (!laberinto.posValida(i, j)) {
            return;
        }
        laberinto.setPaso(i, j, paso);
        if (i == iFin && j == jFin && condicionesAdicionalesSolucion(laberinto)) {
            soluciones.add(laberinto.clone());
        }
        int[][] movimientos = getMovimientos();
        for (int[] movimiento : movimientos) {
            resolver(laberinto, i + movimiento[0], j + movimiento[1], iFin, jFin, paso + 1);
        }
        laberinto.setPaso(i, j, 0);
    }

    @Override
    public LinkedList<Laberinto> getSoluciones() {
        return soluciones;
    }

    @Override
    public LinkedList<Laberinto> getSoluciones(int pasos) {
        LinkedList<Laberinto> solucionesFiltradas = new LinkedList<>();
        for (Laberinto laberinto : soluciones) {
            if (laberinto.getPasos() == pasos) {
                solucionesFiltradas.add(laberinto);
            }
        }
        return solucionesFiltradas;
    }

    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return true;
    }
}
