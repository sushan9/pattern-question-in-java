public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n - row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
