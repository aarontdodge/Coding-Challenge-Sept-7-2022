public class LargestGap {

    public static int findLargestGap(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[j]-arr[i]) > result) result = Math.abs(arr[j]-arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 10, 6, 7};
        int[] test2 = {-3, -1, 6, 7, 0};

        System.out.println(findLargestGap(test1));
        System.out.println(findLargestGap(test2));
    }
}