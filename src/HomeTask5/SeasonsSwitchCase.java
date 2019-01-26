package HomeTask5;

public class SeasonsSwitchCase {
    public static void main(String[] args) {
        getMonthValue(13);

    }
public static void getMonthValue (int n ){
    switch (n) {
        case 12:
        case 1:
        case 2:
            System.out.println("Winter");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Spring");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Summer");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Autumn");
            break;
        default:
            System.out.println("There is no value for a such number of month");
                }
    }
  }
