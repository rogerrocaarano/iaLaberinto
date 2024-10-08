import Laberinto.Laberinto;
import Laberinto.Regla;
import Laberinto.ISolver;
import Solvers.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        tarea1();
        tarea2();
    }

    public static void tarea1() {
        // Tarea 1 - EL PROBLEMA DEL LABERINTO BÁSICO
        // Ejercicio 1
        resolverEjercicio(laberintoSinObstaculos(), reglasHorizontal());
        // Ejercicio 2
        resolverEjercicio(laberintoConObstaculos(), reglasHorizontal());
        // Ejercicio 3
        resolverEjercicio(laberintoSinObstaculos(), reglasHorizontalDiagonal());
        resolverEjercicio(laberintoConObstaculos(), reglasHorizontalDiagonal());
        // Ejercicio 4
        resolverEjercicio(laberintoSinObstaculos(), reglasDiagonal());
        resolverEjercicio(laberintoConObstaculos(), reglasDiagonal());
        // Ejercicio 5
        // Implementado en la clase Laberinto.
    }

    public static void tarea2() {
        // Tarea 2 - EL PROBLEMA DEL LABERINTO CON SALTO DE CABALLO
        // Ejercicio 1
        resolverEjercicio(laberintoSinObstaculos(), reglasCaballo());
        // Ejercicio 2
        resolverEjercicio(laberintoConObstaculos(), reglasCaballo());
        // Ejercicio 3
        // Implementado en la clase Laberinto.
    }

    public static Laberinto laberintoSinObstaculos() {
        return new Laberinto(4, 4);
    }

    public static Laberinto laberintoConObstaculos() {
        Laberinto laberinto = new Laberinto(4, 4);
//        laberinto.setObstaculo(1, 1);
        laberinto.setObstaculo(2, 1);
        return laberinto;
    }

    public static void resolverEjercicio(Laberinto laberinto, ISolver solver) {
        solver.resolver(
                laberinto,
                0,
                0,
                laberinto.getNroFilas() - 1,
                laberinto.getNroColumnas() - 1,
                1
        );
        solver.printSoluciones();
    }

    public static void resolverEjercicio(Laberinto laberinto, LinkedList<Regla> reglas) {
        resolverEjercicio(laberinto, new SolverA(reglas));
        resolverEjercicio(laberinto, new SolverB(reglas));
        resolverEjercicio(laberinto, new SolverC(reglas));
        resolverEjercicio(laberinto, new SolverD(reglas));
        resolverEjercicio(laberinto, new SolverE(reglas));
    }

    public static LinkedList<Regla> reglasHorizontal() {
        LinkedList<Regla> reglas = new LinkedList<>();
        reglas.add(new Regla(-1, 0));
        reglas.add(new Regla(0, 1));
        reglas.add(new Regla(1, 0));
        reglas.add(new Regla(0, -1));
        return reglas;
    }

    public static LinkedList<Regla> reglasHorizontalDiagonal() {
        LinkedList<Regla> reglas = new LinkedList<>();
        reglas.add(new Regla(-1, 0));
        reglas.add(new Regla(-1, 1));
        reglas.add(new Regla(0, 1));
        reglas.add(new Regla(1, 1));
        reglas.add(new Regla(1, 0));
        reglas.add(new Regla(1, -1));
        reglas.add(new Regla(0, -1));
        reglas.add(new Regla(-1, -1));
        return reglas;
    }

    public static LinkedList<Regla> reglasDiagonal() {
        LinkedList<Regla> reglas = new LinkedList<>();
        reglas.add(new Regla(-1, 1));
        reglas.add(new Regla(1, 1));
        reglas.add(new Regla(1, -1));
        reglas.add(new Regla(-1, -1));
        return reglas;
    }

    public static LinkedList<Regla> reglasCaballo() {
        LinkedList<Regla> reglas = new LinkedList<>();
        reglas.add(new Regla(-2, 1));
        reglas.add(new Regla(-1, 2));
        reglas.add(new Regla(1, 2));
        reglas.add(new Regla(2, 1));
        reglas.add(new Regla(2, -1));
        reglas.add(new Regla(1, -2));
        reglas.add(new Regla(-1, -2));
        reglas.add(new Regla(-2, -1));
        return reglas;
    }
}
