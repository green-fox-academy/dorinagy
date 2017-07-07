/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println(bmi);
    }
}
