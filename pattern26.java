public class pattern26 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(n - row + 1);
            }
            System.out.println("");
        }
    }
}
