import java.util.Scanner;

public class LargestInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int largest = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }

            }
        }

        System.out.println("Largest Element = " + largest);

        sc.close();
    }
}