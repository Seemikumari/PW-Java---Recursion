public class SumOfArrayValues {
    public static void main(String[] args) {
        int[] array = {92, 23, 15, -20, 10};
        int sum = findSum(array);
        System.out.println("Sum of the values of the array: " + sum);
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
