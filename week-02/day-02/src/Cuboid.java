/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class Cuboid {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 15;
        double surfaceArea = ((2 * a * b) + (2 * a * c) + (2 * b * c));
        double volume = (a * b * c);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
