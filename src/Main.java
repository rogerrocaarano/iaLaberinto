public class Main {
    static int contadorSoluciones = 0;

    public static void main(String[] args) {
        int dim = 3;
        Laberinto laberinto;
        ILaberintoSolver[] solvers = {
                new LaberintoT1a(),
                new LaberintoT1b(),
                new LaberintoT1c(),
                new LaberintoT1d(),
                new LaberintoT1e()
        };
        String[] descriptions = {
                "todos los caminos posibles desde una \nposición inicial a una posición final",
                "todos los caminos posibles desde una \nposición inicial a una posición final tal que se visiten \ntodas las casillas de la matriz",
                "todos los caminos posibles desde una \nposición inicial a una posición final tal que NO se visiten \ntodas las casillas de la matriz",
                "todos los caminos posibles de máxima \nlongitud desde una posición inicial a una posición final",
                "todos los caminos posibles de mínima \nlongitud desde una posición inicial a una posición final"
        };

        for (int k = 0; k < solvers.length; k++) {
            laberinto = new Laberinto(dim, dim);
            solvers[k].resolver(laberinto, 0, 0, dim - 1, dim - 1, 1);
            for (Laberinto solucion : solvers[k].getSoluciones()) {
                System.out.println(solucion);
            }
            System.out.println("Numero de soluciones (" + descriptions[k] + "): " + solvers[k].getSoluciones().size());
        }
    }
}