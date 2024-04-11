public class ArmstrongNumber {
    public static void main(String[] args) {
        int number1 = 153;
        int number2 = 134;

        System.out.println(number1 + " is Armstrong number: " + isArmstrong(number1));
        System.out.println(number2 + " is Armstrong number: " + isArmstrong(number2));
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
