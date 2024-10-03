public class LaberintoT1b extends LaberintoT1a {
    private boolean todasLasCasillasVisitadas(Laberinto laberinto) {
        for (int i = 0; i < laberinto.getDimX(); i++) {
            for (int j = 0; j < laberinto.getDimY(); j++) {
                if (laberinto.get(i, j) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean condicionesAdicionalesSolucion(Laberinto laberinto) {
        return todasLasCasillasVisitadas(laberinto);
    }
}
