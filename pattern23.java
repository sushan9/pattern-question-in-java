public class pattern23 {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {
            for (int col = 0; col <= 10; col++) {
                if ((row + col) == 5 || (col - row) == 3 || (col - row) == 7 || (col + row) == 9)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
