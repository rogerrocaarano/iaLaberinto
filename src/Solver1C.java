import Laberinto.Laberinto;

public class Solver1C extends Solver1B {
    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return !super.condicionesAdicionalesSolucion(laberinto);
    }
}
