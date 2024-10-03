/**
 * La clase `Laberinto` representa un laberinto con dimensiones y pasos utilizados para resolverlo.
 */
public class Laberinto {
    private int dimX; // Dimensión en el eje X del laberinto
    private int dimY; // Dimensión en el eje Y del laberinto
    private int[][] m; // Matriz que representa el laberinto
    private int pasos; // Número de pasos en el laberinto

    /**
     * Constructor de la clase `Laberinto`.
     *
     * @param dimX Dimensión en el eje X del laberinto
     * @param dimY Dimensión en el eje Y del laberinto
     */
    public Laberinto(int dimX, int dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
        m = new int[dimX][dimY];
    }

    /**
     * Devuelve una representación en cadena del laberinto.
     *
     * @return Cadena que representa el laberinto
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                s.append(m[i][j]).append("\t");
            }
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Crea y devuelve una copia del laberinto.
     *
     * @return Una copia del laberinto
     */
    @Override
    public Laberinto clone() {
        Laberinto laberinto = new Laberinto(dimX, dimY);
        for (int i = 0; i < dimX; i++) {
            System.arraycopy(m[i], 0, laberinto.m[i], 0, dimY);
        }
        laberinto.pasos = pasos;
        return laberinto;
    }

    /**
     * Verifica si una posición es válida en el laberinto.
     *
     * @param i Coordenada en el eje X
     * @param j Coordenada en el eje Y
     * @return `true` si la posición es válida, `false` en caso contrario
     */
    public boolean posValida(int i, int j) {
        return i >= 0 && i < dimX &&
                j >= 0 && j < dimY &&
                m[i][j] == 0;
    }

    /**
     * Establece un paso en una posición específica del laberinto.
     *
     * @param i    Coordenada en el eje X
     * @param j    Coordenada en el eje Y
     * @param paso Valor que actualiza el paso actual
     */
    public void setPaso(int i, int j, int paso) {
        m[i][j] = paso;
        pasos = paso;
    }

    /**
     * Devuelve el número de pasos dados en el laberinto.
     *
     * @return Número de pasos
     */
    public int getPasos() {
        return pasos;
    }

    /**
     * Devuelve la dimensión en el eje X del laberinto.
     *
     * @return Dimensión en el eje X
     */
    public int getDimX() {
        return dimX;
    }

    /**
     * Devuelve la dimensión en el eje Y del laberinto.
     *
     * @return Dimensión en el eje Y
     */
    public int getDimY() {
        return dimY;
    }

    /**
     * Devuelve el valor de una posición específica del laberinto.
     *
     * @param i Coordenada en el eje X
     * @param j Coordenada en el eje Y
     * @return Valor de la posición
     */
    public int get(int i, int j) {
        return m[i][j];
    }
}
