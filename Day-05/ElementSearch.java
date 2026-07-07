import java.util.Scanner;

public class ElementSearch {

    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 45, 67, 23, 89, 10};

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int ans = linearSearch(arr, target);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }

        sc.close();
    }
}
