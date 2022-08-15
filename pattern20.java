public class pattern20 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == n || row == n - n || col <= 1 || col >= 4) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
