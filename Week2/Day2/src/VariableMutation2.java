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
        String out2 = "";
        if (10 < b && b>20) {
            out2 = "Sweet!";
        }
        if (b < 10) {
            out2 = "More!"
        }
        if (b > 20) {
            out2 = "Less!"
        }
        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = False;
        if ((credits >= 50) && (isBonus == False)) {
            c = c - 1;
        }
        if (isBonus == True) {
            c = c;
        }
        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = "";
        if ((d % 4 == 0) && (time <= 200)){
            out3 = "check";
        }
        if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }
        
        System.out.println(out3);
    }
}
}
