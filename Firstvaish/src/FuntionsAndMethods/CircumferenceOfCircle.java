package FuntionsAndMethods;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(getCircumference(radius));
    }
}
