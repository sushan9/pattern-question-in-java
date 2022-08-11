public class pattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col <= 6 - c || col >= 4 + c) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
