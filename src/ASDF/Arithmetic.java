package ASDF;

/**
 * Created by Siret on 19.10.2016.
 */
public class Arithmetic {
    public static void arithmetic(){
        int hour = 11;
                int minute = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);
        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);
    }

}
