package pokracovani5;

import java.math.BigDecimal;
import java.math.MathContext;

public class LudolfovoCisloPi {

    public static void main(String[] args) {

//        ludolfovoCislo();
        noveLudolfovoCislo();
    }

    public static void ludolfovoCislo() {
        double n = 6;
        double x = 1;
        double pi = x * n / 2;
        System.out.println(pi);
        for (int i = 0; i < 50; i++) {
//            System.out.println("iterace:" + i);
            double v1 = Math.sqrt(1 - (x / 2) * (x / 2));
//            System.out.println("v1:" + v1);
            double v2 = 1 - v1;
//            System.out.println("v2:" + v2);
            x = Math.sqrt((x / 2) * (x / 2) + v2 * v2);
//            System.out.println("x:" + x);
            n = n * 2;
            pi = x * n / 2;
            System.out.println(pi);
//            System.out.println();
        }
    }


    public static void noveLudolfovoCislo() {
//        double n = 6;
        var n = new BigDecimal(6);
//        double x = 1;
        var x = new BigDecimal(1);
//        double pi = x * n / 2;
        var pi = x.multiply(n).divide(new BigDecimal(2));
        System.out.println(pi);
        for (int i = 0; i < 3; i++) {
          System.out.println("iterace:" + i);
//          double v1 = Math.sqrt(1 - (x / 2) * (x / 2));
            var v1 = new BigDecimal(1).subtract(x.divide(new BigDecimal(2)).multiply(x.divide(new BigDecimal(2))));
            v1 = v1.sqrt(new MathContext(20));
            System.out.println("v1:" + v1);
//          double v2 = 1 - v1;
            var v2 = new BigDecimal(1).subtract(v1);
          System.out.println("v2:" + v2);
//          x = Math.sqrt((x / 2) * (x / 2) + v2 * v2);
            x = x.divide(new BigDecimal(2)).multiply(x.divide(new BigDecimal(2))).add(v2.multiply(v2));
          System.out.println("x:" + x);
//          n = n * 2;
            n = n.multiply(new BigDecimal(2));
//          pi = x * n / 2;
            pi = x.multiply(n.divide(new BigDecimal(2)));
            System.out.println("Ludolfovo cislo " + pi);
            System.out.println();
        }
    }
}
