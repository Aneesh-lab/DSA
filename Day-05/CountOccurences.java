import java.util.Scanner;

public class CountOccurences {

    static int countNumber(int[] arr, int target) {

        int count = 0;

          for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            count++;
        }

    }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 2, 5, 7, 5, 9, 1};

        System.out.print("Enter number: ");
        int target = sc.nextInt();

        int result = countNumber(arr, target);

        System.out.println("Occurrences = " + result);

        sc.close();

    }
}
