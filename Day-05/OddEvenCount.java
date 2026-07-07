public class OddEvenCount {

    static void countEvenOdd(int[] arr) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);

    }

    public static void main(String[] args) {

        int[] arr = {12, 15, 18, 21, 24, 31, 40};

        countEvenOdd(arr);

    }
}