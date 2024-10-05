package Laberinto;

/**
 * La clase `Laberinto.Laberinto` representa un laberinto con dimensiones y pasos utilizados para resolverlo.
 */
public class Laberinto implements Cloneable {
    private final int nroFilas;
    private final int nroColumnas;
    private int[][] matriz;
    private int pasos;

    /**
     * Constructor de la clase `Laberinto.Laberinto`.
     *
     * @param nroFilas    Dimensión en el eje X del laberinto
     * @param nroColumnas Dimensión en el eje Y del laberinto
     */
    public Laberinto(int nroFilas, int nroColumnas) {
        this.nroFilas = nroFilas;
        this.nroColumnas = nroColumnas;
        matriz = new int[nroFilas][nroColumnas];
    }

    /**
     * Devuelve una representación en cadena del laberinto.
     *
     * @return Cadena que representa el laberinto
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroColumnas; j++) {
                s.append(matriz[i][j]).append("\t");
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
        try {
            Laberinto obj = (Laberinto) super.clone();
            obj.matriz = new int[nroFilas][nroColumnas];
            for (int i = 0; i < nroFilas; i++) {
                System.arraycopy(matriz[i], 0, obj.matriz[i], 0, nroColumnas);
            }
            obj.pasos = pasos;
            return obj;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Verifica si una posición es válida en el laberinto.
     *
     * @param i Coordenada en el eje X
     * @param j Coordenada en el eje Y
     * @return `true` si la posición es válida, `false` en caso contrario
     */
    public boolean posValida(int i, int j) {
        return i >= 0 && i < nroFilas &&
                j >= 0 && j < nroColumnas &&
                matriz[i][j] == 0;
    }

    /**
     * Establece un paso en una posición específica del laberinto.
     *
     * @param i    Coordenada en el eje X
     * @param j    Coordenada en el eje Y
     * @param paso Valor que actualiza el paso actual
     */
    public void setPaso(int i, int j, int paso) {
        matriz[i][j] = paso;
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
    public int getNroFilas() {
        return nroFilas;
    }

    /**
     * Devuelve la dimensión en el eje Y del laberinto.
     *
     * @return Dimensión en el eje Y
     */
    public int getNroColumnas() {
        return nroColumnas;
    }

    /**
     * Devuelve el valor de una posición específica del laberinto.
     *
     * @param i Coordenada en el eje X
     * @param j Coordenada en el eje Y
     * @return Valor de la posición
     */
    public int get(int i, int j) {
        return matriz[i][j];
    }

    public void setObstaculo(int i, int j) {
        matriz[i][j] = -1;
    }


    public void print() {
        System.out.println(this);
    }
}
