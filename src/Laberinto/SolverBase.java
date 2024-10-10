package Laberinto;

import java.util.LinkedList;

public abstract class SolverBase implements ISolver {
    protected LinkedList<Laberinto> soluciones = new LinkedList<>();
    protected LinkedList<Regla> reglas = new LinkedList<>();

    public void resolver(Laberinto laberinto, int i, int j, int iFin, int jFin, int paso) {
        if (!laberinto.posValida(i, j)) {
            return;
        }
        laberinto.setPaso(i, j, paso);
        if (i == iFin && j == jFin && condicionesAdicionalesSolucion(laberinto)) {
            soluciones.add(laberinto.clone());
        }
        LinkedList<Regla> reglasAplicables = reglasAplicables(laberinto, i, j);
        for (Regla r : reglasAplicables) {
            resolver(laberinto, i + r.movimientoX(), j + r.movimientoY(), iFin, jFin, paso + 1);
        }
        laberinto.setPaso(i, j, 0);
    }

    public LinkedList<Laberinto> getSoluciones() {
        return soluciones;
    }

    public LinkedList<Laberinto> getSoluciones(int pasos) {
        LinkedList<Laberinto> solucionesFiltradas = new LinkedList<>();
        for (Laberinto laberinto : soluciones) {
            if (laberinto.getPasos() == pasos) {
                solucionesFiltradas.add(laberinto);
            }
        }
        return solucionesFiltradas;
    }

    public void printSoluciones() {
        LinkedList<Laberinto> soluciones = getSoluciones();
        for (Laberinto laberinto : soluciones) {
            laberinto.print();
        }
        System.out.println("Soluciones encontradas: " + soluciones.size());
    }

    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return true;
    }

    public LinkedList<Regla> reglasAplicables(Laberinto laberinto, int i, int j) {
        LinkedList<Regla> reglasAplicables = new LinkedList<>();
        for (Regla r : reglas) {
           if (r.esValida(laberinto, i, j)) {
               reglasAplicables.add(r);
           }
        }
        return reglasAplicables;
    }
}
