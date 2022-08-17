public class pattern27 {
    public static void main(String[] args) {
        int n = 4;
        int a = 1;
        int b = 17;

        for (int row = n; row >= 1; row--) {

            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a++ + " ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(b++ + " ");
            }
            // Calculates the first number of the second half for the next iteration/line
            b = (b - 1) - ((row - 1) * 2);

            System.out.println("");

        }
    }
}