public class SumOfAlternatingNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        
        int sum1 = sumOfAlternatingNumbers(n1);
        int sum2 = sumOfAlternatingNumbers(n2);
        
        System.out.println("Sum of alternating numbers till " + n1 + ": " + sum1);
        System.out.println("Sum of alternating numbers till " + n2 + ": " + sum2);
    }

    public static int sumOfAlternatingNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract if even
            } else {
                sum += i; // Add if odd
            }
        }
        return sum;
    }
}
