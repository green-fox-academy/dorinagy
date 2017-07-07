/**
 * Created by Nagy Dóra on 2017.03.21..
 */
public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        if (f1 > f2) {
            boolean f1Greater = true;
            System.out.println(f1Greater);
        } else {
            boolean f1Greater = false;
            System.out.println(f1Greater);
        }

        int g1 = 350;
        int g2 = 200;
        if ((g2 * 2) > g1){
            boolean g1g2 = true;
            System.out.println(g1g2);
        } else {
            boolean g1g2 = false;
            System.out.println(g1g2);
        }

        long h = 1357988018575474L;
        long h11 = (h & 11);
        if (h11 == 0) {
            boolean divider = true;
            System.out.println(divider);
        } else {
            boolean divider = false;
            System.out.println(divider);
        }

        int i1 = 10;
        int i2 = 3;
        int i3 = (i2 ^ 2);
        int i4 = (i2 ^ 3);
        if ((i1 > i3) && (i1 < i4)) {
            boolean higher = true;
            System.out.println(higher);
        } else {
            boolean higher = false;
            System.out.println(higher);
        }

        int j = 1521;
        int j3 = (j % 3);
        int j5 = (j % 5);
        if ((j3 == 0) || (j5 == 0)) {
            boolean devided = true;
            System.out.println(devided);
        } else {
            boolean devided = false;
            System.out.println(devided);
        }

        String k = "Apple";
        for (int l = 0; l < 4; l = l + 1) {
            System.out.println(k);
        }
    }
}