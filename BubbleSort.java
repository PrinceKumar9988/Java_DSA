import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Bubble Sort:-


        int[] arr = {99, 87, 36, 25, 85, 34, 65};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
//       Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            boolean ans = true;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    ans = false;
                }
            }
            if (ans) {
                break;
            }
        }

    }

}