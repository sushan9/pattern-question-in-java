public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row - col) == 1 || (row - col) == 3)
                    System.out.print("0" + " ");
                else
                    System.out.print("1" + " ");
            }
            System.out.println("");
        }
    }
}
