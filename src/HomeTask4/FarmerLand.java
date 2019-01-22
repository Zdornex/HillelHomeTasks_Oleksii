package HomeTask4;

public class FarmerLand {
    public static void main(String[] args) {
        System.out.println(perimetr(10, 15));
        System.out.println(square(10, 15));

    }

    public static double perimetr(double x, double y) {

        double result = ((x+y)*2);
        return result;
            }

            public static double square (double x, double y) {
                double result = x*y;
                return result;
            }
}
