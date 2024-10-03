public class LaberintoT1c extends LaberintoT1b {
    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return !super.condicionesAdicionalesSolucion(laberinto);
    }
}
