// public class pattern3 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int row = 1; row <= n; row++) {
//             for (int col = 0; col <= n - row; col++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }

// }

//Doing the same pattern by following the another process

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
