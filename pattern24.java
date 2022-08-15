public class pattern24 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2 * n; row++) {
            for (int col = 0; col <= 10; col++) {
                if (col == 1 || col == 2 * n || (col - row) == 0 || (row + col) == 11) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
