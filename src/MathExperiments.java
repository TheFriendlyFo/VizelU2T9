public class MathExperiments {
    public static void main(String[] args) {
        int[][] tiles = new int[40][140];

        for (double y=0; y<360; y+=0.1) {
            double a = Math.toRadians(y);
            tiles[(int)(Math.sin(a) * 19 + 20)][(int)(Math.cos(a) * 69 + 70)] = 1;
        }
        for (double y=0; y<360; y+=0.1) {
            double a = Math.toRadians(y);
            tiles[(int)(Math.sin(a) * 9 + 20)][(int)(Math.cos(a) * 34 + 70)] = 1;
        }

        for (int[] row : tiles) {
            for (int column : row) {
                System.out.print(column == 1 ? "X" : " ");
            }
            System.out.println();
        }
    }
}
