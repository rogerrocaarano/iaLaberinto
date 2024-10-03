import java.util.LinkedList;

public class LaberintoT1e extends LaberintoT1a {
    @Override
    public LinkedList<Laberinto> getSoluciones() {
        if (soluciones.size() <= 1) {
            return soluciones;
        }
        LinkedList<Laberinto> solucionesMinLongitud = new LinkedList<>();
        int maxLongitud = soluciones.getFirst().getDimX() * soluciones.getFirst().getDimY();
        int minLongitud = 1;
        while (minLongitud <= maxLongitud) {
            solucionesMinLongitud = getSoluciones(minLongitud);
            if (!solucionesMinLongitud.isEmpty()) {
                break;
            }
            minLongitud++;
        }
        return solucionesMinLongitud;
    }
}
