package HomeTask4;

public class DigitSum {
    public static void main(String[] args) {
        int number = 768;
        int sum = 0;
        int digit;

        digit = number % 10;
        sum = sum + digit;

        number = number / 10;

        digit = number % 10;
        sum = sum + digit;

        number = number / 10;

        sum = sum + number;

        System.out.println(sum);

    }
}
