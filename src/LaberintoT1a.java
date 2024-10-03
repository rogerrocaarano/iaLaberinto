public class LaberintoT1a extends LaberintoSolverBase {
    @Override
    public int[][] getMovimientos() {
        return new int[][] {
            {-1, 0},
            {0, 1},
            {1, 0},
            {0, -1}
        };
    }
}
