package hometask1;

public class Start {

    public static void main(String[] args) {


        int addresult = Calculator.add(5, 7);
        System.out.println(addresult);

        int subresult = Calculator.sub(100, 35);
        System.out.println(subresult);

        System.out.println(Calculator.div(200, 50));//same as previous - just another way to show result(easier as for me)

        System.out.println(Calculator.mul(33, 3));

        System.out.println(Calculator.add(2, 3.3));


    }
}
