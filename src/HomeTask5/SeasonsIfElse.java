package HomeTask5;

public class SeasonsIfElse {

    public static void main(String[] args) {

        getMonthValue(12);

    }

    public static void getMonthValue(int n) {
        if ((n == 12) || (n == 1) || (n == 2)) {
            System.out.println("Winter");
        } if ((n == 3) || (n == 4) || (n == 5)){
            System.out.println("Spring");
        } if ((n == 6) || (n == 7) || (n == 8)) {
            System.out.println("Summer");
        } if ((n == 9) || (n == 10) || (n == 11)){
            System.out.println("Autumn");
        }
    }
}
