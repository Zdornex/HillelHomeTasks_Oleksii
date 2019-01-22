package HomeTask4;

public class Trains {
    public static void main(String[] args) {
        System.out.println(compareTime(2, 10));


    }

    public static boolean compareTime(float v1, float v2) {

        float t1 = 4/v1;
        float t2 = 6/v2;
        return (t1>=t2);

    }

}
