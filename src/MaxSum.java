import java.util.Arrays;

public class MaxSum {

    public static int findMaxSum(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int arraySum = Arrays.stream(Arrays.copyOfRange(arr, i, j)).sum();
                if (arraySum > result) result = arraySum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {2, 2, -2};

        System.out.println(findMaxSum(test1));
        System.out.println(findMaxSum(test2));
    }
}
