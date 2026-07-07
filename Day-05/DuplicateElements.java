public class DuplicateElements {

    static void findDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 2, 8, 4, 10};

        System.out.println("Duplicate Elements:");

        findDuplicates(arr);

    }
}
