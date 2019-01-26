package HomeTask5;

public class BitWise {
    public static void main(String[] args) {
        System.out.println(bitDivByFour(100));
        System.out.println(bitDivByFour(32));
        System.out.println(bitDivByFour(8));
        System.out.println(bitDivByFour(6));
        System.out.println(bitDivByFour(4));
        System.out.println(bitDivByFour(3));
        System.out.println(bitDivByFour(1));

    }
    public static long bitDivByFour(double number) {
        long x = (long)number;
        return (x>>2);
    }
}
