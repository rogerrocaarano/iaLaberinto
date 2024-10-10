package Laberinto;

import java.util.LinkedList;

/**
 * Interfaz para resolver laberintos.
 */
public interface ISolver {
    /**
     * Resuelve el laberinto desde una posición inicial a una posición final.
     *
     * @param laberinto El laberinto a resolver.
     * @param i         Fila inicial.
     * @param j         Columna inicial.
     * @param iFin      Fila final.
     * @param jFin      Columna final.
     * @param paso      Número de paso.
     */
    void resolver(Laberinto laberinto, int i, int j, int iFin, int jFin, int paso);

    /**
     * Obtiene todas las soluciones encontradas.
     *
     * @return Lista de soluciones.
     */
    LinkedList<Laberinto> getSoluciones();

    /**
     * Obtiene las soluciones que tienen un número específico de pasos.
     *
     * @param pasos Número de pasos.
     * @return Lista de soluciones con el número específico de pasos.
     */
    LinkedList<Laberinto> getSoluciones(int pasos);

    /**
     * Verifica si se cumplen las condiciones adicionales para una solución.
     *
     * @return true si se cumplen las condiciones adicionales, false en caso contrario.
     */
    boolean condicionesAdicionalesSolucion(Laberinto laberinto);

    /**
     * Imprime las soluciones encontradas.
     */
    void printSoluciones();

    LinkedList<Regla> reglasAplicables(Laberinto laberinto, int i, int j);
}
