import Laberinto.ISolver;
import Laberinto.Laberinto;


public class Main {
    public static void main(String[] args) {
        Laberinto laberinto = new Laberinto(3, 4);
        ISolver solver = new Solver1a();
        solver.resolver(laberinto, 0, 0, 2, 3, 1);
        solver.printSoluciones();
    }
}