
public class pattern16 {
    public static void main(String[] args) {
        int n = 5, val = 1;
        for (int row = 0; row < n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {

                if (col == 0 || row == n)
                    System.out.print("1");
                else

                    System.out.print(" " + (val = val * (row - col + 1) / col));
            }
            System.out.println("");
        }
    }
}
