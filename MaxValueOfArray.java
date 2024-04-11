public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] array = {13, 1, -3, 22, 5};
        int maxValue = findMaxValue(array);
        System.out.println("Max value of the array: " + maxValue);
    }

    public static int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
