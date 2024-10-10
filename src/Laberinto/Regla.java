package Laberinto;

public record Regla(
        int movimientoX,
        int movimientoY
) {
    public boolean esValida(Laberinto laberinto, int i, int j) {
        return laberinto.posValida(i + movimientoX, j + movimientoY);
    }
}