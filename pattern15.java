public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if ((row + col == 6) || (col - row == 4) || (row - col == 4) || (row + col == 14))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
