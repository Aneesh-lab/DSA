import java.util.Scanner;

public class IterationsCount {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        int count = 0;

        while (start <= end) {

            count++;

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                System.out.println("Iterations: " + count);
                return mid;

            } else if (target < arr[mid]) {

                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        System.out.println("Iterations: " + count);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);

        if (ans == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + ans);
        }

        sc.close();
    }
}