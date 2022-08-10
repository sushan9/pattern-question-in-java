public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= 9; col++) {
                if (row == n || (row + col == 6) || (col - row == 4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
