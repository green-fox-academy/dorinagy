/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class VariableMutation2 {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        if (a % 2 == 0) {
            out = out + 1;
        }
        System.out.println(out);

        int b = 13;
        String out2 = " ";
        if (10 < b && b < 20) {
            out2 = "Sweet";
            System.out.println(out2);
        }
        if (b < 10) {
            out2 = "More!";
            System.out.println(out2);
        }
        if (b > 20) {
            out2 = "Less!";
            System.out.println(out2);
        }

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if ((credits >= 50) && (isBonus == false)) {
            c = c - 1;
        }
        if (isBonus == true) {
            c = c;
        }
        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = " ";
        if ((d % 4 == 0) && (time <= 200)){
            out3 = "Check";
            System.out.println(out3);
        }
        if (time > 200) {
            out3 = "Time out";
            System.out.println(out3);
        } else {
            out3 = "Run Forest Run!";
            System.out.println(out3);
        }
    }
}
