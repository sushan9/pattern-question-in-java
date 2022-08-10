public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // for (int spaces = row; spaces < n; spaces++) {
            // System.out.print(" ");
            // }
            for (int col = 0; col <= 9; col++) {
                if (row == n || (row + col == 5) || (col - row == 3))
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}