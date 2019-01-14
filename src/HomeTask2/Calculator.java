package HomeTask2;

public class Calculator {

    public static double add(double a, double b, double c){
        double result1 = a+b*(c/2);
        return result1;
        }

        public static int square (int a, int b){
        int a1 = a*a;
        int b1 = b*b;
        int result2 = a1+b1;
        return result2;
        }

        public static double div (double a, double b, double c) {
        double result3 = (a + b)/12 * c%4 + b;
        return  result3;
        }

        public static double hop (double a, double b, double c) { //просто попробовал назвать метод произвольно "hop" - вроде сработало)))))
        double result4 = (a - b*c)/(a + b)%c;
        return  result4;
    }



}
