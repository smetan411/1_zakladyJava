public class LudolfovoCisloPi {

    public static void main(String[] args) {
        ludolfovoCislo();
    }

    public static void ludolfovoCislo() {
        int n = 6;
        double x = 1;
        double pi = x * n / 2;
        for (int i = 0; i < 25; i++) {
            double v1 = Math.sqrt(1 - (x / 2) * (x / 2));
            double v2 = 1 - v1;
            x = Math.sqrt((x / 2) * (x / 2) + v2 * v2);
            n = n * 2;
            pi = x * n / 2;
            System.out.println(pi);
        }
    }
}
