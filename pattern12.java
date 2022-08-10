public class pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 2 * n; row >= 0; row--) {
            int totalspaces = row > n ? 2 * n - row : row;
            for (int spaces = 0; spaces <= totalspaces; spaces++) {
                System.out.print(" ");
            }
            int totalcols = row > n ? row - n : n - row;
            for (int col = 0; col <= totalcols; col++) {
                System.out.print(" *");
            }

            System.out.println("");
        }
        // for (int row = 1; row <= n; row++) {
        // for (int col = 2; col <= row; col++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
    }
}