import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Enter the target element: ");
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