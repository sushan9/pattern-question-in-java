public class pattern28 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = row > n ? row - n : n - row;
            for (int space = 0; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= c; col++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
