package Tarea1;

import Laberinto.Laberinto;
import Laberinto.ISolver;

public class Main {
    public static void main(String[] args) {
        ejercicio1A();
        ejercicio1B();
        ejercicio1C();
        ejercicio1D();
        ejercicio1E();
    }

    public static Laberinto laberintoSinObstaculos() {
        return new Laberinto(3, 4);
    }

    public static void ejercicio1A() {
        ISolver solver = new SolverEjercicio1A();
        solver.resolver(laberintoSinObstaculos(), 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

    public static void ejercicio1B() {
        ISolver solver = new SolverEjercicio1B();
        solver.resolver(laberintoSinObstaculos(), 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

    public static void ejercicio1C() {
        ISolver solver = new SolverEjercicio1C();
        solver.resolver(laberintoSinObstaculos(), 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

    public static void ejercicio1D() {
        ISolver solver = new SolverEjercicio1D();
        solver.resolver(laberintoSinObstaculos(), 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

    public static void ejercicio1E() {
        ISolver solver = new SolverEjercicio1E();
        solver.resolver(laberintoSinObstaculos(), 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }

}
