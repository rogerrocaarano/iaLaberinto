package Tarea1;

import Laberinto.Laberinto;
import Laberinto.ReglaMovimiento;
import Laberinto.ISolver;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ejercicio1(reglasSinDiagonal());
        ejercicio2(reglasSinDiagonal());

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

    public static void ejercicio1(LinkedList<ReglaMovimiento> reglas) {
        resolverEjercicio(laberintoSinObstaculos(), new SolverA(reglas));
        resolverEjercicio(laberintoSinObstaculos(), new SolverB(reglas));
        resolverEjercicio(laberintoSinObstaculos(), new SolverC(reglas));
        resolverEjercicio(laberintoSinObstaculos(), new SolverD(reglas));
        resolverEjercicio(laberintoSinObstaculos(), new SolverE(reglas));
    }

    public static void ejercicio2(LinkedList<ReglaMovimiento> reglas) {
        // Los Solvers son los mismos que en el ejercicio 1,
        // pero se debe pasar un laberinto con obstáculos
        resolverEjercicio(laberintoConObstaculos(), new SolverA(reglas));
        resolverEjercicio(laberintoConObstaculos(), new SolverB(reglas));
        resolverEjercicio(laberintoConObstaculos(), new SolverC(reglas));
        resolverEjercicio(laberintoConObstaculos(), new SolverD(reglas));
        resolverEjercicio(laberintoConObstaculos(), new SolverE(reglas));
    }

    public static LinkedList<ReglaMovimiento> reglasSinDiagonal() {
        LinkedList<ReglaMovimiento> reglas = new LinkedList<>();
        reglas.add(new ReglaMovimiento(-1, 0));
        reglas.add(new ReglaMovimiento(0, 1));
        reglas.add(new ReglaMovimiento(1, 0));
        reglas.add(new ReglaMovimiento(0, -1));
        return reglas;
    }

    public static LinkedList<ReglaMovimiento> reglasConDiagonal() {
        LinkedList<ReglaMovimiento> reglas = new LinkedList<>();
        reglas.add(new ReglaMovimiento(-1, 0));
        reglas.add(new ReglaMovimiento(-1, 1));
        reglas.add(new ReglaMovimiento(0, 1));
        reglas.add(new ReglaMovimiento(1, 1));
        reglas.add(new ReglaMovimiento(1, 0));
        reglas.add(new ReglaMovimiento(1, -1));
        reglas.add(new ReglaMovimiento(0, -1));
        reglas.add(new ReglaMovimiento(-1, -1));
        return reglas;
    }

    public static LinkedList<ReglaMovimiento> reglasSoloDiagonal() {
        LinkedList<ReglaMovimiento> reglas = new LinkedList<>();
        reglas.add(new ReglaMovimiento(-1, 1));
        reglas.add(new ReglaMovimiento(1, 1));
        reglas.add(new ReglaMovimiento(1, -1));
        reglas.add(new ReglaMovimiento(-1, -1));
        return reglas;
    }
}
