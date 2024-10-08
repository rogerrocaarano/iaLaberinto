package Tarea1;

import Laberinto.Laberinto;
import Laberinto.ISolver;
import Tarea1.LaberintoSinDiagonal.*;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();

    }

    public static Laberinto laberintoSinObstaculos() {
        return new Laberinto(3, 4);
    }

    public static Laberinto laberintoConObstaculos() {
        Laberinto laberinto = new Laberinto(3, 4);
        laberinto.setObstaculo(1, 1);
        laberinto.setObstaculo(2, 1);
        return laberinto;
    }

    public static void resolverEjercicio(Laberinto laberinto, ISolver solver) {
        solver.resolver(laberinto, 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

    public static void ejercicio1() {
        resolverEjercicio(laberintoSinObstaculos(), new SolverEjercicio1A());
        resolverEjercicio(laberintoSinObstaculos(), new SolverEjercicio1B());
        resolverEjercicio(laberintoSinObstaculos(), new SolverEjercicio1C());
        resolverEjercicio(laberintoSinObstaculos(), new SolverEjercicio1D());
        resolverEjercicio(laberintoSinObstaculos(), new SolverEjercicio1E());
    }

    public static void ejercicio2() {
        // Los Solvers son los mismos que en el ejercicio 1,
        // pero se debe pasar un laberinto con obstáculos
        resolverEjercicio(laberintoConObstaculos(), new SolverEjercicio1A());
        resolverEjercicio(laberintoConObstaculos(), new SolverEjercicio1B());
        resolverEjercicio(laberintoConObstaculos(), new SolverEjercicio1C());
        resolverEjercicio(laberintoConObstaculos(), new SolverEjercicio1D());
        resolverEjercicio(laberintoConObstaculos(), new SolverEjercicio1E());
    }
}
