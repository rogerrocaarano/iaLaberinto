public class LaberintoT3a extends LaberintoT1a {
    @Override
    public int[][] getMovimientos() {
        return new int[][] {
                {-1, 0},
                {-1, 1},
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1}
        };
    }
}
