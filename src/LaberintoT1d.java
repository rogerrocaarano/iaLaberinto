import java.util.LinkedList;

public class LaberintoT1d extends LaberintoT1a {
    @Override
    public LinkedList<Laberinto> getSoluciones() {
        if (soluciones.size() <= 1) {
            return soluciones;
        }
        LinkedList<Laberinto> solucionesMaxLongitud = new LinkedList<>();
        int maxLongitud = soluciones.getFirst().getDimX() * soluciones.getFirst().getDimY();
        while (maxLongitud > 0) {
            solucionesMaxLongitud = getSoluciones(maxLongitud);
            if (!solucionesMaxLongitud.isEmpty()) {
                break;
            }
            maxLongitud--;
        }
        return solucionesMaxLongitud;
    }
}
